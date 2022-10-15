package com.elmouttaki.elmehdi.person.mapper;

import com.elmouttaki.elmehdi.person.dto.response.StudentResponse;
import com.elmouttaki.elmehdi.person.model.Student;
import com.elmouttaki.elmehdi.person.utils.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentResponseMapper extends GenericMapper<Student, StudentResponse> {
}
