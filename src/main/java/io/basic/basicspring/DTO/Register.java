package io.basic.basicspring.DTO;

import lombok.Data;

@Data
public class Register {
    private String username;
    private Long phone;
    private String email;
    private String password;
}
