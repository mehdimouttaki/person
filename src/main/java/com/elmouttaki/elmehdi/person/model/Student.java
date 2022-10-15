package com.elmouttaki.elmehdi.person.model;

import com.elmouttaki.elmehdi.person.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String firstName;

    private  String lastName;

    private String username ;

    private String password;

    private Integer age ;


    private String numberStudent;

    private String academicLevel;

    private Role role ;

    private Boolean active;




}
