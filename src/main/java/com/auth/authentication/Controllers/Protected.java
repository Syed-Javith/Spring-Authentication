package com.auth.authentication.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class Protected {
    @GetMapping("/secured")
    public String index() {
        return "Hello! Welcome User";
    }
}
