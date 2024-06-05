package com.victor.security.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestBookDTO(
        @NotBlank @NotNull
        String title,
        @NotBlank @NotNull
        String author,
        @NotNull
        Integer publish,
        @NotBlank @NotNull
        String gender,
        @NotBlank @NotNull
        String summary
) {
}
