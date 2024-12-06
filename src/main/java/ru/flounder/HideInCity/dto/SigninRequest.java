package ru.flounder.HideInCity.dto;

import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SigninRequest {
    private String username;
    private String password;
}
