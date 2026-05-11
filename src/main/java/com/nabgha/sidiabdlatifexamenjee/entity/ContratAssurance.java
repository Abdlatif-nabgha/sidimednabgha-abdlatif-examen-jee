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

    @Column(name = "date_souscription", nullable = false)
    private LocalDate dateSouscription;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private ContratStatus status;

    @Column(name = "date_validation")
    private LocalDate dateValidation;

    @Column(name = "montant_cotisation", nullable = false)
    private double montantCotisation;

    @Column(name = "duree_contrat", nullable = false)
    private int dureeContrat;

    @Column(name = "taux_couverture")
    private double tauxCouverture;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;
}
