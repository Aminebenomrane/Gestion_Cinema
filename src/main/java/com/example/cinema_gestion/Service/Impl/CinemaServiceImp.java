package com.example.cinema_gestion.Service.Impl;

import com.example.cinema_gestion.Dao.CinemaRepository;
import com.example.cinema_gestion.Models.Cinema;
import com.example.cinema_gestion.Service.CinemaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j

public class CinemaServiceImp implements CinemaService {


    @Autowired
    private CinemaRepository cinemaRepository;

    @Override
    public List<Cinema> getAllCinemas() {
        return cinemaRepository.findAll();
    }

    @Override
    public Optional<Cinema> getCinemaById(Long id) {
      return  cinemaRepository.findById(id);

    }

    @Override
    public Cinema saveCinema(Cinema cinema) {
        return cinemaRepository.save(cinema);
    }

    @Override
    public void deleteCinema(Long id) {
        cinemaRepository.deleteById(id);
    }}