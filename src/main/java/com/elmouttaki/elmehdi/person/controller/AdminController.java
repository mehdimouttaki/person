package com.elmouttaki.elmehdi.person.controller;

import com.elmouttaki.elmehdi.person.model.Admin;
import com.elmouttaki.elmehdi.person.model.Role;
import com.elmouttaki.elmehdi.person.service.AdminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequestMapping("admin")
public class AdminController {
    private final AdminService adminService;

    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostConstruct
    public void init(){
        boolean existed= adminService.existByUsername("admin");
        if (!existed){
            Admin admin =new Admin();
            admin.setFirstName("Mehdi");
            admin.setLastName("Mouttaki");
            admin.setUsername("admin");
            admin.setRole(Role.ADMIN);
            adminService.save(admin);
        }

    }

}
