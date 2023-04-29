package com.example.cinema_gestion.Service.Impl;

import com.example.cinema_gestion.Dao.SalleRepository;
import com.example.cinema_gestion.Models.Salle;
import com.example.cinema_gestion.Service.SalleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Slf4j
public class SalleServiceImp implements SalleService {
    @Autowired
private SalleRepository salleRepository;

    @Override
    public List<Salle> getAllSalles() {
        return salleRepository.findAll();
    }

    @Override
    public Optional <Salle> getSalleById(Long id) {
        return salleRepository.findById(id);

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
