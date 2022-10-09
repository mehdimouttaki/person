package com.elmouttaki.elmehdi.person.service;

import com.elmouttaki.elmehdi.person.dto.request.PersonRequest;
import com.elmouttaki.elmehdi.person.dto.response.PersonResponse;
import com.elmouttaki.elmehdi.person.model.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    PersonResponse create(PersonRequest personRequest) throws Exception;

    List<PersonResponse> findAll();

    Optional<Person> findById(Long idPerson);
}
