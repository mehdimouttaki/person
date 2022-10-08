package com.elmouttaki.elmehdi.person.Mapper;

import com.elmouttaki.elmehdi.person.Dto.Request.PersonRequest;
import com.elmouttaki.elmehdi.person.Model.Person;
import com.elmouttaki.elmehdi.person.Utils.GenericMapper;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface PersonRequestMapper extends GenericMapper<Person,PersonRequest> {




}
