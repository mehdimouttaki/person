package com.elmouttaki.elmehdi.person.controller;

import com.elmouttaki.elmehdi.person.dto.request.StudentRequest;
import com.elmouttaki.elmehdi.person.dto.response.StudentResponse;
import com.elmouttaki.elmehdi.person.dto.response.TeacherResponse;
import com.elmouttaki.elmehdi.person.enums.SchoolCodeRsp;
import com.elmouttaki.elmehdi.person.service.StudentService;
import com.elmouttaki.elmehdi.person.utils.SchoolRsp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "student")
public class StudentController {

    private final StudentService studentService;


    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public SchoolRsp<StudentResponse> create(@RequestBody StudentRequest studentRequest) throws Exception {
        return  new SchoolRsp<>(SchoolCodeRsp.ACCEPTED,studentService.create(studentRequest));
    }
}
