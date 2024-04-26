package com.example.apiproducts.dtos;

import jakarta.validation.constraints.NotBlank;

public record LoginResponseDTO(@NotBlank String token) {
}