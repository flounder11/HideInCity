package ru.flounder.HideInCity.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SigninRequest {
    private String username;
    private String password;
}