package ru.flounder.HideInCity.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/user")
public class UserController {
    @GetMapping("/home")
    public String home(Principal principal) {
        if (principal != null) {
            return principal.getName();
        }
        return "At first u need authorize";
    }
}
