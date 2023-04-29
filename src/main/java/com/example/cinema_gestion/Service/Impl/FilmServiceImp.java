package com.example.cinema_gestion.Service.Impl;

import com.example.cinema_gestion.Dao.FilmRepository;
import com.example.cinema_gestion.Models.Film;
import com.example.cinema_gestion.Service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class FilmServiceImp implements FilmService {
    @Autowired
    private FilmRepository filmRepository;

    @Override
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }

    @Override
    public Optional<Film> getFilmById(Long id) {

        return filmRepository.findById(id);
    }

    @Override
    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public void deleteFilm(Long id) {
        filmRepository.deleteById(id);
    }

    @Override
    public ResponseEntity<Film> updateFilm(Long id, Film film) {
        Optional<Film> optionalFilm = filmRepository.findById(id);
        if (!optionalFilm.isPresent()) {
            return ResponseEntity.notFound().build();}
            Film existingFilm = optionalFilm.get();

            existingFilm.setTitre(film.getTitre());
            existingFilm.setRealisateur(film.getRealisateur());
            existingFilm.setActeur(film.getActeur());
            existingFilm.setAnneeSortie(film.getAnneeSortie());
            existingFilm.setGenre(film.getGenre());
            existingFilm.setDuree(film.getDuree());
            existingFilm.setMontant(film.getMontant());
            existingFilm.setHeureProjection(film.getHeureProjection());


            Film updateFilm = filmRepository.save(existingFilm);




        return ResponseEntity.ok(updateFilm);

        }
    }









    /*@Override
    public List<Film> searchFilmsByTitle(String title) {
        return filmRepository.findByTitleContainingIgnoreCase(title);*/


