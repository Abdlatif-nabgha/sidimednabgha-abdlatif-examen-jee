package com.nabgha.sidiabdlatifexamenjee.entity;


import com.nabgha.sidiabdlatifexamenjee.enums.TypeLogement;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@DiscriminatorValue("habitation")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class ContratHabitation extends ContratAssurance {

    @Enumerated(EnumType.STRING)
    private TypeLogement typeLogement;

    private String addresse;

    private String superficie;
}
