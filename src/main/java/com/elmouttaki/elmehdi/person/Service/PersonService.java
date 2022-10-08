package com.elmouttaki.elmehdi.person.Service;

import com.elmouttaki.elmehdi.person.Dto.Request.PersonRequest;
import com.elmouttaki.elmehdi.person.Dto.Response.PersonResponse;

public interface PersonService {

    PersonResponse create(PersonRequest personRequest) throws Exception;

    PersonResponse findAll();
}
