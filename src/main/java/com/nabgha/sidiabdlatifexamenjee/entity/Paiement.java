package com.nabgha.sidiabdlatifexamenjee.entity;

import com.nabgha.sidiabdlatifexamenjee.enums.PaiementType;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "paiements")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "date_paiement")
    private LocalDate date;

    @Column(name = "montant")
    private double montant;

    @Enumerated(EnumType.STRING)
    @Column(name = "type_paiement")
    private PaiementType type;

    @ManyToOne
    @JoinColumn(name = "contrat_id")
    private ContratAssurance contratAssurance;
}
