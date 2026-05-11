package com.nabgha.sidiabdlatifexamenjee.service;

import com.nabgha.sidiabdlatifexamenjee.dto.request.ContratAutomobileRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.request.ContratHabitationRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.request.ContratSanteRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ContratAutomobileResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ContratHabitationResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ContratSanteResponseDTO;
import java.util.List;

public interface ContratService {
    // Automobile
    ContratAutomobileResponseDTO saveContratAutomobile(ContratAutomobileRequestDTO dto);
    List<ContratAutomobileResponseDTO> getAllContratsAutomobile();
    
    // Habitation
    ContratHabitationResponseDTO saveContratHabitation(ContratHabitationRequestDTO dto);
    List<ContratHabitationResponseDTO> getAllContratsHabitation();
    
    // Sante
    ContratSanteResponseDTO saveContratSante(ContratSanteRequestDTO dto);
    List<ContratSanteResponseDTO> getAllContratsSante();

    // Common actions
    void validateContrat(Long id);
    void resilierContrat(Long id);
    List<?> getContratsByClient(Long clientId);
}
