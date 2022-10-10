package com.elmouttaki.elmehdi.person.mapper;

import com.elmouttaki.elmehdi.person.dto.response.TeacherResponse;
import com.elmouttaki.elmehdi.person.model.Teacher;
import com.elmouttaki.elmehdi.person.utils.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TeacherResponseMapper extends GenericMapper<Teacher, TeacherResponse> {

}
