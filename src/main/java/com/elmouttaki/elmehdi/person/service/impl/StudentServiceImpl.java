package com.elmouttaki.elmehdi.person.service.impl;

import com.elmouttaki.elmehdi.person.dto.request.StudentRequest;
import com.elmouttaki.elmehdi.person.dto.response.StudentResponse;
import com.elmouttaki.elmehdi.person.enums.SchoolCommonBusinessError;
import com.elmouttaki.elmehdi.person.exception.SchoolBusinessException;
import com.elmouttaki.elmehdi.person.exception.SchoolErrorEnum;
import com.elmouttaki.elmehdi.person.mapper.StudentRequestMapper;
import com.elmouttaki.elmehdi.person.mapper.StudentResponseMapper;
import com.elmouttaki.elmehdi.person.model.Student;
import com.elmouttaki.elmehdi.person.repository.StudentRepository;
import com.elmouttaki.elmehdi.person.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository ;

    private final StudentRequestMapper studentRequestMapper;

    private final StudentResponseMapper studentResponseMapper;

    public StudentServiceImpl(StudentRepository studentRepository, StudentRequestMapper studentRequestMapper, StudentResponseMapper studentResponseMapper) {
        this.studentRepository = studentRepository;
        this.studentRequestMapper = studentRequestMapper;
        this.studentResponseMapper = studentResponseMapper;
    }

    @Override
    public StudentResponse create(StudentRequest studentRequest) throws Exception {
        Student student = studentRepository.save(studentRequestMapper.targetToSource(studentRequest));
        StudentResponse studentResponse = studentResponseMapper.sourceToTarget(student);
        return studentResponse;
    }

    @Override
    public StudentResponse findById(Long id) throws Exception {
        return studentResponseMapper.sourceToTarget(studentRepository.findById(id).orElseThrow(() -> new SchoolBusinessException(SchoolCommonBusinessError.SCBE00002SCHOOL_COMMON_BUSINESS_ERROR)));
    }

    @Override
    public List findAllStudent() {
        return null;
    }

}
