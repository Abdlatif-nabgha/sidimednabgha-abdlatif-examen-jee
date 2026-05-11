package com.nabgha.sidiabdlatifexamenjee.entity;

import com.nabgha.sidiabdlatifexamenjee.enums.ContratStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "contrats_assurance")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", length = 32)
@Getter @Setter @AllArgsConstructor @NoArgsConstructor
public class ContratAssurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private LocalDate dateSouscription;
    private ContratStatus status;
    private LocalDate dateValidation;
    private double montantCotisation;
    private int dureeContrat;
    private double tauxCouverture;
}
