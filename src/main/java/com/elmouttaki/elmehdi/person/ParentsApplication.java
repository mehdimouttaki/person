package com.elmouttaki.elmehdi.person;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.elmouttaki.elmehdi.person.Mapper")

public class ParentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ParentsApplication.class, args);
    }

}
