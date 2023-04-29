package com.example.cinema_gestion.Controller;

import com.example.cinema_gestion.Controller.Api.ClientApi;
import com.example.cinema_gestion.Models.Client;

import java.util.List;
import java.util.Optional;

public class ControllerClient implements ClientApi {
    @Override
    public Client save(Client client) {
        return null;
    }

    @Override
    public Optional<Client> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
