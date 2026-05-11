package com.nabgha.sidiabdlatifexamenjee.dto.response;

import com.nabgha.sidiabdlatifexamenjee.enums.ContratStatus;
import java.time.LocalDate;

public record ContratAutomobileResponseDTO(
    Long id,
    LocalDate dateSouscription,
    ContratStatus status,
    LocalDate dateValidation,
    double montantCotisation,
    int dureeContrat,
    double tauxCouverture,
    ClientResponseDTO client,
    String numeroImmatriculation,
    String markVehicule,
    String modeleVehicule
) {}
