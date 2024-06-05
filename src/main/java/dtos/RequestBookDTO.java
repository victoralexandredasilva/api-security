package dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record RequestBookDTO(
        @NotBlank @NotNull
        String title,
        @NotBlank @NotNull
        String publish,
        @NotBlank @NotNull
        String gender,
        @NotBlank @NotNull
        String summary
) {
}