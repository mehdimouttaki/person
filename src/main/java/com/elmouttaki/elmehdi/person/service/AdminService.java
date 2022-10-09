package com.elmouttaki.elmehdi.person.service;

import com.elmouttaki.elmehdi.person.model.Admin;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    
    boolean existByUsername(String admin);

    Admin save(Admin username);
}
