package com.example.cinema_gestion.Service.Impl;

import com.example.cinema_gestion.Dao.SalleRepository;
import com.example.cinema_gestion.Models.Salle;
import com.example.cinema_gestion.Service.SalleService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class SalleServiceImp implements SalleService {
    @Autowired
private SalleRepository salleRepository;

    @Override
    public List<Salle> getAllSalles() {
        return salleRepository.findAll();
    }

    @Override
    public Salle getSalleById(Long id) {
        Optional<Salle> optionalSalle = salleRepository.findById(id);
        return optionalSalle.orElse(null);
    }

    @Override
    public Salle saveSalle(Salle salle) {
        return salleRepository.save(salle);
    }

    @Override
    public void deleteSalle(Long id) {
        salleRepository.deleteById(id);
    }

   /* @Override
    public List<Salle> getSallesByCinema(Long cinemaId) {
        return salleRepository.findByCinema_Id(cinemaId);
    }*/
}
