package com.elmouttaki.elmehdi.person.repository;

import com.elmouttaki.elmehdi.person.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Long> {
}
