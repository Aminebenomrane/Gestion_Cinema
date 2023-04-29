package com.example.cinema_gestion.Service;

import com.example.cinema_gestion.Models.Salle;

import java.util.List;
import java.util.Optional;

public interface SalleService {
    List<Salle> getAllSalles();
    Optional <Salle>  getSalleById(Long id);
    Salle saveSalle(Salle salle);
    void deleteSalle(Long id);
   // List<Salle> getSallesByCinema(Long cinemaId);

}
