package com.elmouttaki.elmehdi.person.service;

import com.elmouttaki.elmehdi.person.dto.request.EmployeeRequest;
import com.elmouttaki.elmehdi.person.dto.response.EmployeeResponse;

public interface EmployeeService {
    EmployeeResponse create(EmployeeRequest employeeRequest) throws Exception;
}
