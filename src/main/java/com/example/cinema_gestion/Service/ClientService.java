package com.example.cinema_gestion.Service;

import com.example.cinema_gestion.Models.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClients();
    Client getClientById(Long id);
    Client saveClient(Client client);
    void deleteClient(Long id);
}
