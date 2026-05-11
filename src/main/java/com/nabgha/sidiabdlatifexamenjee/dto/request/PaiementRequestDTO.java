package com.nabgha.sidiabdlatifexamenjee.dto.request;

import com.nabgha.sidiabdlatifexamenjee.enums.PaiementType;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record PaiementRequestDTO(
    @Positive(message = "Le montant doit être supérieur à zéro")
    double montant,

    @NotNull(message = "Le type de paiement est obligatoire")
    PaiementType type,

    @NotNull(message = "L'ID du contrat est obligatoire")
    Long contratId
) {}
