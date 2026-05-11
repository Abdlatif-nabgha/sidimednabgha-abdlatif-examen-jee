package com.nabgha.sidiabdlatifexamenjee.dto.response;

import com.nabgha.sidiabdlatifexamenjee.enums.PaiementType;
import java.time.LocalDate;

public record PaiementResponseDTO(
    Long id,
    LocalDate date,
    double montant,
    PaiementType type
) {}
