package com.elmouttaki.elmehdi.person.controller;

import com.elmouttaki.elmehdi.person.dto.request.PersonRequest;
import com.elmouttaki.elmehdi.person.dto.response.PersonResponse;
import com.elmouttaki.elmehdi.person.model.Person;
import com.elmouttaki.elmehdi.person.service.PersonService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
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
    public ResponseEntity<List<PersonResponse>> findAll() {
        return ResponseEntity.ok(personService.findAll());
    }

    @GetMapping("{idPerson}")
    public Optional<Person> findById(@PathVariable Long idPerson){
        return personService.findById(idPerson);
    }

}


