package com.example.ms.comment;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class UserCreationDTO {
    private String login;
    private String password;
    private String birthYear;
    private String about;
}

