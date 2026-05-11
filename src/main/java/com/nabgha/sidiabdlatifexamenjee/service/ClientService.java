package com.nabgha.sidiabdlatifexamenjee.service;

import com.nabgha.sidiabdlatifexamenjee.dto.request.ClientRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ClientResponseDTO;
import java.util.List;

public interface ClientService {
    ClientResponseDTO saveClient(ClientRequestDTO clientRequestDTO);
    ClientResponseDTO getClientById(Long id);
    List<ClientResponseDTO> getAllClients();
    ClientResponseDTO updateClient(Long id, ClientRequestDTO clientRequestDTO);
    void deleteClient(Long id);
}
