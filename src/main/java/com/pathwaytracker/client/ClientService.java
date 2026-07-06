package com.pathwaytracker.client;

import java.util.List;

public interface ClientService {
    ClientResponse createClient(ClientRequest request);
    ClientResponse getClient(Long id);
    List<ClientResponse> getAllClients();
}