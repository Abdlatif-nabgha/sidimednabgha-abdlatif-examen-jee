package com.nabgha.sidiabdlatifexamenjee.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDate;

public record ContratAutomobileRequestDTO(
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

    @NotBlank(message = "Le numéro d'immatriculation est obligatoire")
    String numeroImmatriculation,

    @NotBlank(message = "La marque est obligatoire")
    String markVehicule,

    @NotBlank(message = "Le modèle est obligatoire")
    String modeleVehicule
) {}
