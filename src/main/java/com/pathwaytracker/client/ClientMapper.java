package com.pathwaytracker.client;

import org.springframework.stereotype.Component;

@Component
public class ClientMapper {
    public Client toEntity(ClientRequest request) {
        Client client = new Client();
        client.setFirstName(request.getFirstName());
        client.setLastName(request.getLastName());
        client.setEmail(request.getEmail());
        client.setDateOfBirth(request.getDateOfBirth());
        client.setReferralDate(request.getReferralDate());
        return client;
    }

    public ClientResponse toResponse(Client client) {
        ClientResponse response = new ClientResponse();
        response.setId(client.getId());
        response.setFirstName(client.getFirstName());
        response.setLastName(client.getLastName());
        response.setEmail(client.getEmail());
        response.setDateOfBirth(client.getDateOfBirth());
        response.setReferralDate(client.getReferralDate());
        return response;
    }
    
}
