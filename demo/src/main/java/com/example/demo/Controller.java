package com.example.demo;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
public class Controller {

    @GetMapping("public/api")
    public String publicApi() {
        return "PUBLIC API ACCESS";
    }

    @RolesAllowed("ADMIN")
    @GetMapping("admin/api")
    public String adminApi(Authentication authentication) {
        return "ADMIN API FOR " + authentication.getName() + " role: ADMIN";
    }


    @RolesAllowed("SUPPORT")
    @GetMapping("support/api")
    public String supportApi(Authentication authentication) {
        return "SUPPORT API FOR" + authentication.getName() + " role: SUPPORT";
    }
}