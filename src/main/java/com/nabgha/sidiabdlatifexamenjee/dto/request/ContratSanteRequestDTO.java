package com.nabgha.sidiabdlatifexamenjee.dto.request;

import com.nabgha.sidiabdlatifexamenjee.enums.NiveauConverture;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDate;

public record ContratSanteRequestDTO(
    @NotNull(message = "La date de souscription est obligatoire")
    LocalDate dateSouscription,

    @Positive(message = "Le montant de la cotisation doit être positif")
    double montantCotisation,

    @Positive(message = "La durée du contrat doit être positive")
    int dureeContrat,

    @Positive(message = "Le taux de couverture doit être positif")
    double tauxCouverture,

    @NotNull(message = "Le client est obligatoire")
    Long clientId,

    @NotNull(message = "Le niveau de couverture est obligatoire")
    NiveauConverture converture,

    @Positive(message = "Le nombre de personnes doit être au moins 1")
    int nombrePersonne
) {}
