package com.nabgha.sidiabdlatifexamenjee.entity;

import com.nabgha.sidiabdlatifexamenjee.enums.NiveauConverture;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("sante")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ContratSante extends ContratAssurance {

    @Column(name = "converture")
    @Enumerated(EnumType.STRING)
    private NiveauConverture converture;

    @Column(name = "nombre_personne")
    private int nombrePersonne;
}
