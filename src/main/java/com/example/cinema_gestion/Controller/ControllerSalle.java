package com.example.cinema_gestion.Controller;

import com.example.cinema_gestion.Controller.Api.SalleApi;
import com.example.cinema_gestion.Models.Salle;

import java.util.List;
import java.util.Optional;

public class ControllerSalle implements SalleApi {
    @Override
    public Salle save(Salle salle) {
        return null;
    }

    @Override
    public Optional<Salle> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Salle> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
