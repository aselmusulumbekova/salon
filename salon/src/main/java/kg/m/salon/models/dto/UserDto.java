package kg.m.salon.models.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserDto {
    Long id;
    String name;
    String login;
    String password;
    String email;
    String phone;

}
