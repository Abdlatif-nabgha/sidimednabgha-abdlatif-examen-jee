package com.nabgha.sidiabdlatifexamenjee.dto.response;

import com.nabgha.sidiabdlatifexamenjee.enums.ContratStatus;
import com.nabgha.sidiabdlatifexamenjee.enums.TypeLogement;
import java.time.LocalDate;

public record ContratHabitationResponseDTO(
    Long id,
    LocalDate dateSouscription,
    ContratStatus status,
    LocalDate dateValidation,
    double montantCotisation,
    int dureeContrat,
    double tauxCouverture,
    ClientResponseDTO client,
    TypeLogement typeLogement,
    String addresse,
    String superficie
) {}
