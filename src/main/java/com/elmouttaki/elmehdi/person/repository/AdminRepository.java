package com.elmouttaki.elmehdi.person.repository;

import com.elmouttaki.elmehdi.person.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin,Long> {
    boolean existsByUsername(String username);
}
