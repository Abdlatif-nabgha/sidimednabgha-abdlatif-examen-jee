package com.nabgha.sidiabdlatifexamenjee.dto.response;

import com.nabgha.sidiabdlatifexamenjee.enums.ContratStatus;
import com.nabgha.sidiabdlatifexamenjee.enums.NiveauConverture;
import java.time.LocalDate;

public record ContratSanteResponseDTO(
    Long id,
    LocalDate dateSouscription,
    ContratStatus status,
    LocalDate dateValidation,
    double montantCotisation,
    int dureeContrat,
    double tauxCouverture,
    ClientResponseDTO client,
    NiveauConverture converture,
    int nombrePersonne
) {}
