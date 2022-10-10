package com.elmouttaki.elmehdi.person.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity(name = "admin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Admin implements Serializable {
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

    private Role role ;

    private Boolean active;



}
