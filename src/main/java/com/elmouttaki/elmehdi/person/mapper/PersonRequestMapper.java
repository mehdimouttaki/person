package com.elmouttaki.elmehdi.person.mapper;

import com.elmouttaki.elmehdi.person.dto.request.PersonRequest;
import com.elmouttaki.elmehdi.person.model.Person;
import com.elmouttaki.elmehdi.person.utils.GenericMapper;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonRequestMapper extends GenericMapper<Person, PersonRequest> {
}
