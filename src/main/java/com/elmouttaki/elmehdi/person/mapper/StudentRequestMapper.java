package com.elmouttaki.elmehdi.person.mapper;

import com.elmouttaki.elmehdi.person.dto.request.StudentRequest;
import com.elmouttaki.elmehdi.person.model.Student;
import com.elmouttaki.elmehdi.person.utils.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface StudentRequestMapper extends GenericMapper<Student, StudentRequest> {
}
