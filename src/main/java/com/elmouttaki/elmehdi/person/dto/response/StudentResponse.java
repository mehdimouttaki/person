package com.elmouttaki.elmehdi.person.dto.response;

import com.elmouttaki.elmehdi.person.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class StudentResponse {
    private Long id;

    private String firstName;

    private  String lastName;

    private String username ;

    private String password;

    private Integer age ;

    private String numberStudent;

    private String academicLevel;

    private Role role ;

    private Boolean active ;
}
