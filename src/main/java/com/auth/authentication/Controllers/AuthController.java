package com.auth.authentication.Controllers;

import com.auth.authentication.Models.AuthResponse;
import com.auth.authentication.Models.Login;
import com.auth.authentication.Models.Register;
import com.auth.authentication.Services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/auth")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public AuthResponse register(@RequestBody Register register) {
        return authService.register(register);
    }

    @PostMapping("/login")
    public AuthResponse login(@RequestBody Login login) throws Exception {
        return authService.login(login);
    }
}
