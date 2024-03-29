package com.opensw.safeguard.domain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FindByUsernameResponse {

    private boolean exitsMember;

    @NotBlank
    private String username;


}
