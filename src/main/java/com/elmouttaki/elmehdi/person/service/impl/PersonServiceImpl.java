package com.elmouttaki.elmehdi.person.service.impl;

import com.elmouttaki.elmehdi.person.dto.request.PersonRequest;
import com.elmouttaki.elmehdi.person.dto.response.PersonResponse;
import com.elmouttaki.elmehdi.person.model.Person;
import com.elmouttaki.elmehdi.person.repository.PersonRepository;
import com.elmouttaki.elmehdi.person.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceImpl implements PersonService {
    private  final  PersonRepository personRepository;
    private  final PersonMapper personMapper;

    public PersonServiceImpl(PersonRepository personRepository, PersonMapper personMapper ) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }

    @Override
    public PersonResponse create(PersonRequest personRequest) throws Exception {
        Person person = personRepository.save(personMapper.mapToPerson(personRequest));
        PersonResponse personResponse = personMapper.mapToResponse(person);
        return personResponse;
    }

    @Override
    public List<PersonResponse> findAll() {
        return personMapper.mapToResponses( personRepository.findAll());
    }

    @Override
    public Optional<Person> findById(Long idPerson) {
        return personRepository.findById(idPerson);
    }
}
