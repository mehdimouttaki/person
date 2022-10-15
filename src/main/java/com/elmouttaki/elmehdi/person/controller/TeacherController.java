package com.elmouttaki.elmehdi.person.controller;

import com.elmouttaki.elmehdi.person.enums.SchoolCodeRsp;
import com.elmouttaki.elmehdi.person.dto.request.TeacherRequest;
import com.elmouttaki.elmehdi.person.dto.response.TeacherResponse;
import com.elmouttaki.elmehdi.person.service.TeacherService;
import com.elmouttaki.elmehdi.person.utils.SchoolRsp;
import com.elmouttaki.elmehdi.person.utils.SearchRequest;
import com.elmouttaki.elmehdi.person.utils.SearchResponse;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("teacher")
public class TeacherController {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }



    @PostMapping
    public SchoolRsp<TeacherResponse> create(@RequestBody  TeacherRequest teacherRequest) throws Exception {
        return new SchoolRsp<>(SchoolCodeRsp.ACCEPTED,teacherService.create(teacherRequest)) ;
    }

    @GetMapping("/{id}")
    public TeacherResponse findById(@PathVariable Long id) throws Exception {
        return  teacherService.findById(id);
    }

    @PostMapping("/all")
    public SchoolRsp<SearchResponse<TeacherResponse>>findAllTeacher(@RequestParam(defaultValue = "0") Integer pageNum,
                                                                                @RequestParam(defaultValue = "5") Integer pageSize,
                                                                                @RequestParam(defaultValue = "id") String sortBy,
                                                                                @RequestParam(defaultValue = "1") Integer sortOrder,
                                                                                @RequestBody(required = false) List<SearchRequest> searchResponses) throws Exception {

        List<TeacherResponse> teacherResponses = teacherService.findAllTeacher(searchResponses, pageNum, pageSize, sortBy, sortOrder);
        SearchResponse<TeacherResponse> searchRequest = new SearchResponse<>();
        searchRequest.setSearchValue(teacherResponses);
        return new SchoolRsp<>(SchoolCodeRsp.ACCEPTED, searchRequest);
        }
    }

