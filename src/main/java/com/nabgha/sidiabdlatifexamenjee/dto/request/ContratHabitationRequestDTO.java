package com.nabgha.sidiabdlatifexamenjee.dto.request;

import com.nabgha.sidiabdlatifexamenjee.enums.TypeLogement;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.time.LocalDate;

public record ContratHabitationRequestDTO(
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

    @NotNull(message = "Le type de logement est obligatoire")
    TypeLogement typeLogement,

    @NotBlank(message = "L'adresse est obligatoire")
    String addresse,

    @NotBlank(message = "La superficie est obligatoire")
    String superficie
) {}
