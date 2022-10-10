package com.elmouttaki.elmehdi.person.controller;

import com.elmouttaki.elmehdi.person.dto.request.TeacherRequest;
import com.elmouttaki.elmehdi.person.dto.response.TeacherResponse;
import com.elmouttaki.elmehdi.person.service.TeacherService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("teacher")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @PostMapping
    public TeacherResponse create(TeacherRequest teacherRequest) throws Exception {
        return teacherService.create(teacherRequest);
    }
}
