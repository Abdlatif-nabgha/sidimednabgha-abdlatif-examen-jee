package com.nabgha.sidiabdlatifexamenjee.mapper;

import com.nabgha.sidiabdlatifexamenjee.dto.request.ContratHabitationRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ContratHabitationResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.entity.ContratHabitation;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", uses = {ClientMapper.class})
public interface ContratHabitationMapper {
    @Mapping(target = "client.id", source = "clientId")
    ContratHabitation toContratHabitation(ContratHabitationRequestDTO dto);

    ContratHabitationResponseDTO fromContratHabitation(ContratHabitation entity);
}
