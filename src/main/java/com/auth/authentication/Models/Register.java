package com.auth.authentication.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Register {
    private String password;
    private String firstName;
    private String lastName;
    private String email;
}
