package com.elmouttaki.elmehdi.person.service.impl;

import com.elmouttaki.elmehdi.person.model.Admin;
import com.elmouttaki.elmehdi.person.repository.AdminRepository;
import com.elmouttaki.elmehdi.person.service.AdminService;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {
    private final AdminRepository adminRepository ;

    public AdminServiceImpl(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    @Override
    public boolean existByUsername(String username) {
        return adminRepository.existsByUsername(username);
    }

    @Override
    public Admin save(Admin admin) {
    return adminRepository.save(admin);
    }
}
