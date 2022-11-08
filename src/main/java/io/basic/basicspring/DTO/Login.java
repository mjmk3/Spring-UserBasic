package io.basic.basicspring.DTO;

import lombok.Data;

@Data
public class Login {
    private String usernameOrPhoneOrEmail;
    private String password;
}
