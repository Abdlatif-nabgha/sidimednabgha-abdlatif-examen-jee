package com.nabgha.sidiabdlatifexamenjee.mapper;

import com.nabgha.sidiabdlatifexamenjee.dto.request.ClientRequestDTO;
import com.nabgha.sidiabdlatifexamenjee.dto.response.ClientResponseDTO;
import com.nabgha.sidiabdlatifexamenjee.entity.Client;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    Client toClient(ClientRequestDTO clientRequestDTO);
    ClientResponseDTO fromClient(Client client);
}
