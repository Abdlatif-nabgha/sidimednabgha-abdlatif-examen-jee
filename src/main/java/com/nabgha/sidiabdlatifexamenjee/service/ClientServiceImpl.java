package com.nabgha.sidiabdlatifexamenjee.service;

import com.nabgha.sidiabdlatifexamenjee.dto.request.ClientRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ClientResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.entity.Client;
import com.nabgha.sidiabdlatifexamenjee.mapper.ClientMapper;
import com.nabgha.sidiabdlatifexamenjee.repository.ClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientMapper clientMapper;
    private final ClientRepository clientRepository;

    @Override
    public ClientResponseDTO saveClient(ClientRequestDTO clientRequestDTO) {
        // ClientRequestDTO -> Client
        Client client = clientMapper.toClient(clientRequestDTO);
        clientRepository.save(client);
        // Client -> ClientResponseDTO
        return clientMapper.fromClient(client);
    }

    @Override
    public ClientResponseDTO getClientById(Long id) {
        Client client = clientRepository.findById(id)
                .orElseThrow(()-> new RuntimeException("Client not found"));
        return clientMapper.fromClient(client);
    }

    @Override
    public List<ClientResponseDTO> getAllClients() {
        return clientRepository.findAll()
                .stream()
                .map(clientMapper::fromClient)
                .toList();
    }

    @Override
    public ClientResponseDTO updateClient(Long id, ClientRequestDTO clientRequestDTO) {
        Client client = clientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Client not found"));
        
        client.setNom(clientRequestDTO.nom());
        client.setEmail(clientRequestDTO.email());
        
        Client updatedClient = clientRepository.save(client);
        return clientMapper.fromClient(updatedClient);
    }

    @Override
    public void deleteClient(Long id) {
        clientRepository.deleteById(id);
    }
}
