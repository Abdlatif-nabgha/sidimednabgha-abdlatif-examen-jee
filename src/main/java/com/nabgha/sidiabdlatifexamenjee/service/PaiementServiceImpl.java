package com.nabgha.sidiabdlatifexamenjee.service;

import com.nabgha.sidiabdlatifexamenjee.dto.request.PaiementRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.PaiementResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.entity.Paiement;
import com.nabgha.sidiabdlatifexamenjee.mapper.PaiementMapper;
import com.nabgha.sidiabdlatifexamenjee.repository.PaiementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class PaiementServiceImpl implements PaiementService {

    private final PaiementRepository paiementRepository;
    private final PaiementMapper paiementMapper;

    @Override
    public PaiementResponseDTO processPaiement(PaiementRequestDTO dto) {
        Paiement paiement = paiementMapper.toPaiement(dto);
        paiement.setDate(LocalDate.now());
        return paiementMapper.fromPaiement(paiementRepository.save(paiement));
    }

    @Override
    public List<PaiementResponseDTO> getPaiementsByContrat(Long contratId) {
        return paiementRepository.findAll().stream()
                .filter(p -> p.getContratAssurance() != null && p.getContratAssurance().getId().equals(contratId))
                .map(paiementMapper::fromPaiement)
                .toList();
    }

    @Override
    public PaiementResponseDTO getPaiementById(Long id) {
        Paiement paiement = paiementRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Paiement not found"));
        return paiementMapper.fromPaiement(paiement);
    }
}
