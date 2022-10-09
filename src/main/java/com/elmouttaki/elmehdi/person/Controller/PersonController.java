package com.elmouttaki.elmehdi.person.Controller;

import com.elmouttaki.elmehdi.person.Dto.Request.PersonRequest;
import com.elmouttaki.elmehdi.person.Dto.Response.PersonResponse;
import com.elmouttaki.elmehdi.person.Model.Person;
import com.elmouttaki.elmehdi.person.Service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/person")
public class PersonController {
    private final PersonService personService;


    public PersonController(PersonService personService) {
        this.personService = personService;

    }

    @PostMapping
    public PersonResponse add(@RequestBody PersonRequest personRequest) throws Exception {
        return personService.create(personRequest);
    }

    @GetMapping("/all")
    public PersonResponse findAll() {
        return personService.findAll();
    }

    @GetMapping("{idPerson}")
    public Optional<Person> findById(@PathVariable Long idPerson){
        return personService.findById(idPerson);
    }

}


