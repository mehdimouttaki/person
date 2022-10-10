package com.elmouttaki.elmehdi.person.dto.request;

import com.elmouttaki.elmehdi.person.model.Person;
import com.elmouttaki.elmehdi.person.model.Role;
import com.elmouttaki.elmehdi.person.model.Teacher;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.ManyToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TeacherRequest {
    private String firstName;

    private  String lastName;

    private String username ;

    private String password;

    private Integer age ;

    private String cin;

    private String familySituation;

    private Role role ;

    private Boolean active;
}
