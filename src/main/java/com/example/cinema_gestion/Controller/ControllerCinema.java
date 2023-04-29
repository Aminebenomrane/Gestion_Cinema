package com.example.cinema_gestion.Controller;

import com.example.cinema_gestion.Controller.Api.CinemaApi;
import com.example.cinema_gestion.Models.Cinema;

import java.util.List;
import java.util.Optional;

public class ControllerCinema implements CinemaApi {
    @Override
    public Cinema save(Cinema cinema) {
        return null;
    }

    @Override
    public Optional<Cinema> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Cinema> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
