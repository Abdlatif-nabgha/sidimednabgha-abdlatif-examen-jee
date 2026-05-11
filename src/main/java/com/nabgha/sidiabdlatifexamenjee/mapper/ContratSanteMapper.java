package com.nabgha.sidiabdlatifexamenjee.mapper;

import com.nabgha.sidiabdlatifexamenjee.dto.request.ContratSanteRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ContratSanteResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.entity.ContratSante;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ClientMapper.class})
public interface ContratSanteMapper {
    @Mapping(target = "client.id", source = "clientId")
    ContratSante toContratSante(ContratSanteRequestDTO dto);

    ContratSanteResponseDTO fromContratSante(ContratSante entity);
}
