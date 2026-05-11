package com.nabgha.sidiabdlatifexamenjee.mapper;

import com.nabgha.sidiabdlatifexamenjee.dto.request.PaiementRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.PaiementResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.entity.Paiement;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface PaiementMapper {
    @Mapping(target = "contratAssurance.id", source = "contratId")
    Paiement toPaiement(PaiementRequestDTO dto);

    PaiementResponseDTO fromPaiement(Paiement paiement);
}
