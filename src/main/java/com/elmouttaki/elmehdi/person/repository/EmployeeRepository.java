package com.elmouttaki.elmehdi.person.repository;

import com.elmouttaki.elmehdi.person.model.Employees;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<Employees,Long> {
}
