package com.opensw.safeguard.domain.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FindByPasswordRequest {

    @NotBlank(message = "아이디는 필수 값 입니다")
    private String username;

    @NotBlank(message = "패스워드는 필수 값 입니다")
    private String email;
}
