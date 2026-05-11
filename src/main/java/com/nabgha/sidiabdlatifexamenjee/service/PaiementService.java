package com.nabgha.sidiabdlatifexamenjee.service;

import com.nabgha.sidiabdlatifexamenjee.dto.request.PaiementRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.PaiementResponseDTO;
import java.util.List;

public interface PaiementService {
    PaiementResponseDTO processPaiement(PaiementRequestDTO dto);
    List<PaiementResponseDTO> getPaiementsByContrat(Long contratId);
    PaiementResponseDTO getPaiementById(Long id);
}
