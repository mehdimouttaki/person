package com.elmouttaki.elmehdi.person.service;


import com.elmouttaki.elmehdi.person.dto.request.TeacherRequest;
import com.elmouttaki.elmehdi.person.dto.response.TeacherResponse;
import com.elmouttaki.elmehdi.person.utils.SearchRequest;

import java.util.List;

public interface TeacherService {
    TeacherResponse create(TeacherRequest teacherRequest) throws Exception;

    TeacherResponse findById(Long id) throws Exception;

    List<TeacherResponse> findAllTeacher(List<SearchRequest> searchResponse, Integer pageNo, Integer pageSize, String sortBy, Integer sortOrder) throws Exception;



    /**
     * number of pharmacologicalClasses in the DB
     *
     * @param searchResponse: user search preferences
     * @return number
     */

}
