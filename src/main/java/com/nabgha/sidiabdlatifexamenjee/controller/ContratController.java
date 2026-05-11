package com.nabgha.sidiabdlatifexamenjee.controller;

import com.nabgha.sidiabdlatifexamenjee.dto.request.ContratAutomobileRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.request.ContratHabitationRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.request.ContratSanteRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ContratAutomobileResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ContratHabitationResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ContratSanteResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.service.ContratService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contracts")
@RequiredArgsConstructor
public class ContratController {

    private final ContratService contratService;

    // --- Creation Endpoints ---

    @PostMapping("/automobile")
    public ResponseEntity<ContratAutomobileResponseDTO> saveAutomobile(@RequestBody @Valid ContratAutomobileRequestDTO dto) {
        return ResponseEntity.ok(contratService.saveContratAutomobile(dto));
    }

    @PostMapping("/habitation")
    public ResponseEntity<ContratHabitationResponseDTO> saveHabitation(@RequestBody @Valid ContratHabitationRequestDTO dto) {
        return ResponseEntity.ok(contratService.saveContratHabitation(dto));
    }

    @PostMapping("/sante")
    public ResponseEntity<ContratSanteResponseDTO> saveSante(@RequestBody @Valid ContratSanteRequestDTO dto) {
        return ResponseEntity.ok(contratService.saveContratSante(dto));
    }

    // --- Retrieval Endpoints ---

    @GetMapping("/automobile")
    public ResponseEntity<List<ContratAutomobileResponseDTO>> getAllAutomobile() {
        return ResponseEntity.ok(contratService.getAllContratsAutomobile());
    }

    @GetMapping("/habitation")
    public ResponseEntity<List<ContratHabitationResponseDTO>> getAllHabitation() {
        return ResponseEntity.ok(contratService.getAllContratsHabitation());
    }

    @GetMapping("/sante")
    public ResponseEntity<List<ContratSanteResponseDTO>> getAllSante() {
        return ResponseEntity.ok(contratService.getAllContratsSante());
    }

    @GetMapping("/client/{clientId}")
    public ResponseEntity<List<?>> getByClient(@PathVariable Long clientId) {
        return ResponseEntity.ok(contratService.getContratsByClient(clientId));
    }

    // --- Action Endpoints ---

    @PatchMapping("/{id}/validate")
    public ResponseEntity<Void> validate(@PathVariable Long id) {
        contratService.validateContrat(id);
        return ResponseEntity.noContent().build();
    }

    @PatchMapping("/{id}/resilier")
    public ResponseEntity<Void> resilier(@PathVariable Long id) {
        contratService.resilierContrat(id);
        return ResponseEntity.noContent().build();
    }
}
