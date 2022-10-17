package com.elmouttaki.elmehdi.person.controller;

import com.elmouttaki.elmehdi.person.dto.request.EmployeeRequest;
import com.elmouttaki.elmehdi.person.dto.response.EmployeeResponse;
import com.elmouttaki.elmehdi.person.enums.SchoolCodeRsp;
import com.elmouttaki.elmehdi.person.service.EmployeeService;
import com.elmouttaki.elmehdi.person.utils.SchoolRsp;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping
    public SchoolRsp<EmployeeResponse> create(@RequestBody EmployeeRequest employeeRequest) throws Exception {
        return  new SchoolRsp<>(SchoolCodeRsp.ACCEPTED,employeeService.create(employeeRequest));
    }
}
