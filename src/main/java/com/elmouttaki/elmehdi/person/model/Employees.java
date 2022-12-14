package com.elmouttaki.elmehdi.person.model;

import com.elmouttaki.elmehdi.person.enums.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
@Entity(name = "employees")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employees implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    private String firstName;

    private  String lastName;

    private String username ;

    private String password;

    private Integer age ;

    private String cin;

    private String familySituation;

    private String cnssNumber;

    private Role role ;

    private Boolean active;

}
