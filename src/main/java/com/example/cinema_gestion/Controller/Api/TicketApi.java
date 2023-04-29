package com.example.cinema_gestion.Controller.Api;

import com.example.cinema_gestion.Models.Ticket;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import static com.example.cinema_gestion.Utils.Constants.Api_Root;

public interface TicketApi {
    @PostMapping(value = Api_Root + "/Ticket/create")
    Ticket save(@RequestBody Ticket ticket);

    @GetMapping(value = Api_Root + "/Ticket/{id}")
    Optional<Ticket> findById(@PathVariable("id") Long id);
    @GetMapping(value = Api_Root + "/Ticket/All")
    List<Ticket> findAll();
    @DeleteMapping(value = Api_Root + "/Ticket/delete/{id}")
    void delete(Long id);
}
