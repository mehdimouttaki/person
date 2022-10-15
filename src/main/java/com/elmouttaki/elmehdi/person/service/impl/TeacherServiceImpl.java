package com.elmouttaki.elmehdi.person.service.impl;

import com.elmouttaki.elmehdi.person.enums.SchoolCommonBusinessError;
import com.elmouttaki.elmehdi.person.dto.request.TeacherRequest;
import com.elmouttaki.elmehdi.person.dto.response.TeacherResponse;
import com.elmouttaki.elmehdi.person.exception.SchoolBusinessException;
import com.elmouttaki.elmehdi.person.mapper.TeacherRequestMapper;
import com.elmouttaki.elmehdi.person.mapper.TeacherResponseMapper;
import com.elmouttaki.elmehdi.person.model.Teacher;
import com.elmouttaki.elmehdi.person.repository.TeacherRepository;
import com.elmouttaki.elmehdi.person.service.TeacherService;
import com.elmouttaki.elmehdi.person.utils.SearchRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImpl  implements TeacherService {
    private final TeacherRepository teacherRepository;
    private final TeacherRequestMapper teacherRequestMapper;
    private final TeacherResponseMapper teacherResponseMapper;

    public TeacherServiceImpl(TeacherRepository teacherRepository, TeacherRequestMapper teacherRequestMapper, TeacherResponseMapper teacherResponseMapper) {
        this.teacherRepository = teacherRepository;
        this.teacherRequestMapper = teacherRequestMapper;
        this.teacherResponseMapper = teacherResponseMapper;
    }

    @Override
    public TeacherResponse create(TeacherRequest teacherRequest) throws Exception {
        Teacher teacher = teacherRepository.save(teacherRequestMapper.targetToSource(teacherRequest));
        TeacherResponse teacherResponse = teacherResponseMapper.sourceToTarget(teacher);
        return teacherResponse;
    }

    @Override
    public TeacherResponse findById(Long id) throws Exception {
        return teacherResponseMapper.sourceToTarget(teacherRepository.findById(id).orElseThrow(() -> new SchoolBusinessException(SchoolCommonBusinessError.SCBE00001SCHOOL_COMMON_BUSINESS_ERROR)));
    }

    @Override
    public List<TeacherResponse> findAllTeacher(List<SearchRequest> searchResponse, Integer pageNo, Integer pageSize, String sortBy, Integer sortOrder) throws Exception {
        return teacherResponseMapper.sourceListToTargetList((List<Teacher>) teacherRepository.findAll());
    }




}