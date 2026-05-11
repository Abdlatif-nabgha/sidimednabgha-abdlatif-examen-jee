package com.nabgha.sidiabdlatifexamenjee.dto.request;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ClientRequestDTO(
    @NotBlank(message = "Le nom est obligatoire")
    @Size(min = 2, max = 50, message = "Le nom doit avoir entre 2 et 50 caractères")
    String nom,

    @NotBlank(message = "L'email est obligatoire")
    @Email(message = "L'email doit être valide")
    String email
) {}
