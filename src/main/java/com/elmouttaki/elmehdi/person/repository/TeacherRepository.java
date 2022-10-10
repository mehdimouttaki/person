package com.elmouttaki.elmehdi.person.repository;

import com.elmouttaki.elmehdi.person.model.Teacher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeacherRepository extends CrudRepository<Teacher,Long> {
}
