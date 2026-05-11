package com.nabgha.sidiabdlatifexamenjee.controller;

import com.nabgha.sidiabdlatifexamenjee.dto.request.PaiementRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.PaiementResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.service.PaiementService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
@RequiredArgsConstructor
public class PaiementController {

    private final PaiementService paiementService;

    @PostMapping
    public ResponseEntity<PaiementResponseDTO> process(@RequestBody @Valid PaiementRequestDTO dto) {
        return ResponseEntity.ok(paiementService.processPaiement(dto));
    }

    @GetMapping("/contract/{contractId}")
    public ResponseEntity<List<PaiementResponseDTO>> getByContract(@PathVariable Long contractId) {
        return ResponseEntity.ok(paiementService.getPaiementsByContrat(contractId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaiementResponseDTO> getById(@PathVariable Long id) {
        return ResponseEntity.ok(paiementService.getPaiementById(id));
    }
}
