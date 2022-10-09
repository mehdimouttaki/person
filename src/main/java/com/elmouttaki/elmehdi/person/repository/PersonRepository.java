package com.elmouttaki.elmehdi.person.repository;

import com.elmouttaki.elmehdi.person.model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
