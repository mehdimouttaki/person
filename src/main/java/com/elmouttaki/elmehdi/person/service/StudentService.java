package com.elmouttaki.elmehdi.person.service;

import com.elmouttaki.elmehdi.person.dto.request.StudentRequest;
import com.elmouttaki.elmehdi.person.dto.response.StudentResponse;

public interface StudentService {

    StudentResponse create(StudentRequest studentRequest) throws Exception;
}
