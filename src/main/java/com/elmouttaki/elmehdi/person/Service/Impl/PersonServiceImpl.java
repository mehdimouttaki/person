package com.elmouttaki.elmehdi.person.Service.Impl;

import com.elmouttaki.elmehdi.person.Dto.Request.PersonRequest;
import com.elmouttaki.elmehdi.person.Dto.Response.PersonResponse;
import com.elmouttaki.elmehdi.person.Mapper.PersonResponseMapper;
import com.elmouttaki.elmehdi.person.Mapper.PersonRequestMapper;
import com.elmouttaki.elmehdi.person.Model.Person;
import com.elmouttaki.elmehdi.person.Repository.PersonRepository;
import com.elmouttaki.elmehdi.person.Service.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {
    private  final  PersonRepository personRepository;
    private final PersonRequestMapper personRequestMapper ;
    private final PersonResponseMapper personResponseMapper ;

    public PersonServiceImpl(PersonRepository personRepository, PersonRequestMapper personRequestMapper, PersonRequestMapper personResponseMapper, PersonResponseMapper personResponseMapper1) {
        this.personRepository = personRepository;
        this.personRequestMapper = personRequestMapper;

        this.personResponseMapper = personResponseMapper1;
    }

    @Override
    public PersonResponse create(PersonRequest personRequest) throws Exception {
        Person person = personRepository.save(personRequestMapper.targetToSource(personRequest));
        PersonResponse personResponse = personResponseMapper.sourceToTarget(person);
        return personResponse;
    }

    @Override
    public PersonResponse findAll() {
        return (PersonResponse) personRepository.findAll();
    }
}
