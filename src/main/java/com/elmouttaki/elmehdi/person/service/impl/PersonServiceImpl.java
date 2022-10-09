package com.elmouttaki.elmehdi.person.service.impl;

import com.elmouttaki.elmehdi.person.dto.request.PersonRequest;
import com.elmouttaki.elmehdi.person.dto.response.PersonResponse;
import com.elmouttaki.elmehdi.person.mapper.PersonRequestMapper;
import com.elmouttaki.elmehdi.person.mapper.PersonResponseMapper;
import com.elmouttaki.elmehdi.person.model.Person;
import com.elmouttaki.elmehdi.person.repository.PersonRepository;
import com.elmouttaki.elmehdi.person.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    private  final  PersonRepository personRepository;
    private  final PersonRequestMapper personRequestMapper;
    private final PersonResponseMapper personResponseMapper;

    public PersonServiceImpl(PersonRepository personRepository, PersonRequestMapper personRequestMapper, PersonResponseMapper personResponseMapper) {
        this.personRepository = personRepository;

        this.personRequestMapper = personRequestMapper;
        this.personResponseMapper = personResponseMapper;
    }

    @Override
    public PersonResponse create(PersonRequest personRequest) throws Exception {
        Person person = personRepository.save(personRequestMapper.targetToSource(personRequest));
        PersonResponse personResponse = personResponseMapper.sourceToTarget(person);
        return personResponse;
    }

    @Override
    public List<PersonResponse> findAll() {
    return null;

    }

    @Override
    public Optional<Person> findById(Long idPerson) {
        return personRepository.findById(idPerson);
    }
}
