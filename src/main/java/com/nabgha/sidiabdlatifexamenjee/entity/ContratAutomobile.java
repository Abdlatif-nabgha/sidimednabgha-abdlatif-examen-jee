package com.nabgha.sidiabdlatifexamenjee.entity;


import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("automobile")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ContratAutomobile extends ContratAssurance {

    @Column(name = "numero_immatriculation")
    private String numeroImmatriculation;

    @Column(name = "mark_vehicule")
    private String markVehicule;

    @Column(name = "modele_vehicule")
    private String modeleVehicule;
}
