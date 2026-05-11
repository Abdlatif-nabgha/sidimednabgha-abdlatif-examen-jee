package com.nabgha.sidiabdlatifexamenjee.mapper;

import com.nabgha.sidiabdlatifexamenjee.dto.request.ContratAutomobileRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ContratAutomobileResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.entity.ContratAutomobile;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ClientMapper.class})
public interface ContratAutomobileMapper {
    @Mapping(target = "client.id", source = "clientId")
    ContratAutomobile toContratAutomobile(ContratAutomobileRequestDTO dto);

    ContratAutomobileResponseDTO fromContratAutomobile(ContratAutomobile entity);
}
