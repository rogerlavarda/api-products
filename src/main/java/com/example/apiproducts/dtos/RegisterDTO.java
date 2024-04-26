package com.example.apiproducts.dtos;

import com.example.apiproducts.models.Role;
import jakarta.validation.constraints.NotBlank;

public record RegisterDTO(@NotBlank String login, @NotBlank String password, @NotBlank Role role) {
}
