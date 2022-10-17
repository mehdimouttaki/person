package com.elmouttaki.elmehdi.person.mapper;

import com.elmouttaki.elmehdi.person.dto.response.EmployeeResponse;
import com.elmouttaki.elmehdi.person.model.Employees;
import com.elmouttaki.elmehdi.person.utils.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EmployeeResponseMapper extends GenericMapper<Employees, EmployeeResponse> {
}
