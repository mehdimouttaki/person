package com.elmouttaki.elmehdi.person.mapper;

import com.elmouttaki.elmehdi.person.dto.request.TeacherRequest;
import com.elmouttaki.elmehdi.person.model.Teacher;
import com.elmouttaki.elmehdi.person.utils.GenericMapper;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface TeacherRequestMapper extends GenericMapper<Teacher, TeacherRequest> {
}
