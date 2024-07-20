package com.auth.authentication.Controllers;

import com.auth.authentication.Services.JwtService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class Protected {
    private final JwtService jwtService;

    public Protected(JwtService jwtService) {
        this.jwtService = jwtService;
    }

    @GetMapping("/secured")
    public String index(@RequestHeader("Authorization") String token) {
        if (token.startsWith("Bearer ")) {
            token = token.substring(7);
        }

        String user = jwtService.extractUsername(token);
        return "Hello! Welcome " + user;
    }
}
