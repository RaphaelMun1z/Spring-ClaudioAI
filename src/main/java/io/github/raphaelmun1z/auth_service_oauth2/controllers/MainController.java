package io.github.raphaelmun1z.auth_service_oauth2.controllers;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class MainController {
    @GetMapping("/")
    public String home(){
        return "Hello World";
    }

    @RequestMapping("/user")
    public Principal getPrincipal(Principal user){
        return user;
    }
}
