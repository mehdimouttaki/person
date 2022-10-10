package com.elmouttaki.elmehdi.person.service;


import com.elmouttaki.elmehdi.person.dto.request.TeacherRequest;
import com.elmouttaki.elmehdi.person.dto.response.TeacherResponse;

public interface TeacherService {
    TeacherResponse create(TeacherRequest teacherRequest) throws Exception;
}
