package com.example.cinema_gestion.Controller.Api;

import com.example.cinema_gestion.Models.Client;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.example.cinema_gestion.Utils.Constants.Api_Root;

public interface ClientApi {
    @PostMapping(value = Api_Root + "/Client/create")
    Client save(@RequestBody Client client);

    @GetMapping(value = Api_Root + "/Client/{id}")
    Optional<Client> findById(@PathVariable("id") Long id);

    @GetMapping(value = Api_Root + "/Client/All")
    List<Client> findAll();
    @DeleteMapping(value = Api_Root + "/Client/delete/{id}")
    void delete(Long id);
}
