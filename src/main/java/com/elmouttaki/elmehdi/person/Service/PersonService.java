package com.elmouttaki.elmehdi.person.Service;

import com.elmouttaki.elmehdi.person.Dto.Request.PersonRequest;
import com.elmouttaki.elmehdi.person.Dto.Response.PersonResponse;
import com.elmouttaki.elmehdi.person.Model.Person;

import java.util.Optional;

public interface PersonService {

    PersonResponse create(PersonRequest personRequest) throws Exception;

    PersonResponse findAll();

    Optional<Person> findById(Long idPerson);
}
