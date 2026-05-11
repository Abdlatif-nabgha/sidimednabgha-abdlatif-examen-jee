package com.nabgha.sidiabdlatifexamenjee.service;

import com.nabgha.sidiabdlatifexamenjee.dto.request.ContratAutomobileRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.request.ContratHabitationRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.request.ContratSanteRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ContratAutomobileResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ContratHabitationResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ContratSanteResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.entity.*;
import com.nabgha.sidiabdlatifexamenjee.enums.ContratStatus;
import com.nabgha.sidiabdlatifexamenjee.mapper.*;
import com.nabgha.sidiabdlatifexamenjee.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ContratServiceImpl implements ContratService {

    private final ContratAssuranceRepository contratRepository;
    private final ContratAutomobileRepository autoRepository;
    private final ContratHabitationRepository habitationRepository;
    private final ContratSanteRepository santeRepository;
    
    private final ContratAutomobileMapper autoMapper;
    private final ContratHabitationMapper habitationMapper;
    private final ContratSanteMapper santeMapper;

    @Override
    public ContratAutomobileResponseDTO saveContratAutomobile(ContratAutomobileRequestDTO dto) {
        ContratAutomobile entity = autoMapper.toContratAutomobile(dto);
        entity.setStatus(ContratStatus.ENCOURS);
        return autoMapper.fromContratAutomobile(autoRepository.save(entity));
    }

    @Override
    public List<ContratAutomobileResponseDTO> getAllContratsAutomobile() {
        return autoRepository.findAll().stream().map(autoMapper::fromContratAutomobile).toList();
    }

    @Override
    public ContratHabitationResponseDTO saveContratHabitation(ContratHabitationRequestDTO dto) {
        ContratHabitation entity = habitationMapper.toContratHabitation(dto);
        entity.setStatus(ContratStatus.ENCOURS);
        return habitationMapper.fromContratHabitation(habitationRepository.save(entity));
    }

    @Override
    public List<ContratHabitationResponseDTO> getAllContratsHabitation() {
        return habitationRepository.findAll().stream().map(habitationMapper::fromContratHabitation).toList();
    }

    @Override
    public ContratSanteResponseDTO saveContratSante(ContratSanteRequestDTO dto) {
        ContratSante entity = santeMapper.toContratSante(dto);
        entity.setStatus(ContratStatus.ENCOURS);
        return santeMapper.fromContratSante(santeRepository.save(entity));
    }

    @Override
    public List<ContratSanteResponseDTO> getAllContratsSante() {
        return santeRepository.findAll().stream().map(santeMapper::fromContratSante).toList();
    }

    @Override
    public void validateContrat(Long id) {
        ContratAssurance contrat = contratRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contrat not found"));
        contrat.setStatus(ContratStatus.VALIDE);
        contrat.setDateValidation(LocalDate.now());
        contratRepository.save(contrat);
    }

    @Override
    public void resilierContrat(Long id) {
        ContratAssurance contrat = contratRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contrat not found"));
        contrat.setStatus(ContratStatus.RESILIE);
        contratRepository.save(contrat);
    }

    @Override
    public List<ContratAssurance> getContratsByClient(Long clientId) {
        // This would typically return base entities or a generic DTO list
        // For simplicity in this exam context, we return the base entities or could map to a generic DTO
        return contratRepository.findAll().stream()
                .filter(c -> c.getClient() != null && c.getClient().getId().equals(clientId))
                .toList();
    }
}
