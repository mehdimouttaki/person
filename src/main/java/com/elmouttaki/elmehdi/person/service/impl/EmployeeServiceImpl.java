package com.elmouttaki.elmehdi.person.service.impl;

import com.elmouttaki.elmehdi.person.dto.request.EmployeeRequest;
import com.elmouttaki.elmehdi.person.dto.response.EmployeeResponse;
import com.elmouttaki.elmehdi.person.mapper.EmployeeRequestMapper;
import com.elmouttaki.elmehdi.person.mapper.EmployeeResponseMapper;
import com.elmouttaki.elmehdi.person.model.Employees;
import com.elmouttaki.elmehdi.person.repository.EmployeeRepository;
import com.elmouttaki.elmehdi.person.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final EmployeeRequestMapper employeeRequestMapper;
    private final EmployeeResponseMapper employeeResponseMapper;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository, EmployeeRequestMapper employeeRequestMapper, EmployeeResponseMapper employeeResponseMapper) {
        this.employeeRepository = employeeRepository;
        this.employeeRequestMapper = employeeRequestMapper;
        this.employeeResponseMapper = employeeResponseMapper;
    }

    @Override
    public EmployeeResponse create(EmployeeRequest employeeRequest) throws Exception {
        Employees employees= employeeRepository.save(employeeRequestMapper.targetToSource(employeeRequest));
        EmployeeResponse employeeResponse = employeeResponseMapper.sourceToTarget(employees);
        return employeeResponse;
    }
}
