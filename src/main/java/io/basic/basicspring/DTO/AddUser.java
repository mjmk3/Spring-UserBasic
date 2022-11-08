package io.basic.basicspring.DTO;

import io.basic.basicspring.Entity.Privilege;
import io.basic.basicspring.Entity.Role;
import lombok.Data;

@Data
public class AddUser {
    private String username;
    private Long phone;
    private String email;
    private String password;
    private Role role;
    private Privilege privilege;
}
