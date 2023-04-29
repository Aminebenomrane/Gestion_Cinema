package com.example.cinema_gestion.Service;

import com.example.cinema_gestion.Models.Cinema;

import java.util.List;

public interface CinemaService {
    List<Cinema> getAllCinemas();
    Cinema getCinemaById(Long id);
    Cinema saveCinema(Cinema cinema);
    void deleteCinema(Long id);
}


