package com.elmouttaki.elmehdi.person.Dto.Request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PersonRequest {

    private String firstName;

    private  String lastName;

    private String username ;

    private String password;

    private Integer age ;

    private String familySituation;

    private String role ;
}