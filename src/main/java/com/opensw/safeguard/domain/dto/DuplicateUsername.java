package com.opensw.safeguard.domain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DuplicateUsername {

    @NotBlank(message = "아이디는 필수 입력 du값 입니다")
    private String username;
    private boolean duplicate;

}
