package com.elmouttaki.elmehdi.person.service;

import com.elmouttaki.elmehdi.person.dto.request.StudentRequest;
import com.elmouttaki.elmehdi.person.dto.response.StudentResponse;

import java.util.List;

public interface StudentService {

    StudentResponse create(StudentRequest studentRequest) throws Exception;

    StudentResponse findById(Long id) throws Exception;

    List findAllStudent();
}
