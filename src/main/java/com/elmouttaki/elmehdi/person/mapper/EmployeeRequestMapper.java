package com.elmouttaki.elmehdi.person.mapper;

import com.elmouttaki.elmehdi.person.dto.request.EmployeeRequest;
import com.elmouttaki.elmehdi.person.model.Employees;
import com.elmouttaki.elmehdi.person.utils.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeRequestMapper extends GenericMapper<Employees, EmployeeRequest> {
}
