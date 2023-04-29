package com.example.cinema_gestion.Controller.Api;

import com.example.cinema_gestion.Models.Cinema;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.example.cinema_gestion.Utils.Constants.Api_Root;

public interface CinemaApi {

    @PostMapping(value = Api_Root + "/cinema/create")
    Cinema save(@RequestBody Cinema cinema);
    @GetMapping(value = Api_Root + "/cinema/{id}")
    Optional<Cinema> findById(@PathVariable("id") Long id);
    @GetMapping(value = Api_Root + "/cinema/All")
    List<Cinema> findAll();
    @DeleteMapping(value = Api_Root + "/cinema/delete/{id}")
    void delete(@PathVariable("id") Long id);
}
