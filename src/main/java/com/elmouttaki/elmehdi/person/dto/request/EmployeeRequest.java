package com.elmouttaki.elmehdi.person.dto.request;

import com.elmouttaki.elmehdi.person.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeRequest {
    private String firstName;

    private  String lastName;

    private String username ;

    private String password;

    private Integer age ;

    private String cin;

    private String familySituation;

    private String cnssNumber;

    private Role role ;

    private Boolean active ;
}
