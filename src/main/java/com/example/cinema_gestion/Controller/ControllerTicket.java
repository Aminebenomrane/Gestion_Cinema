package com.example.cinema_gestion.Controller;

import com.example.cinema_gestion.Controller.Api.TicketApi;
import com.example.cinema_gestion.Models.Ticket;

import java.util.List;
import java.util.Optional;

public class ControllerTicket implements TicketApi {
    @Override
    public Ticket save(Ticket ticket) {
        return null;
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Ticket> findAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
