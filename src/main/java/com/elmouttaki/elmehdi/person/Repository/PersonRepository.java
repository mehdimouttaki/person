package com.elmouttaki.elmehdi.person.Repository;

import com.elmouttaki.elmehdi.person.Model.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {
}
