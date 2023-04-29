package com.example.cinema_gestion.Service.Impl;

import com.example.cinema_gestion.Dao.TicketRepository;
import com.example.cinema_gestion.Models.Ticket;
import com.example.cinema_gestion.Service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TickerServiceImp implements TicketService {
    @Autowired
private TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Ticket getTicketById(Long id) {
        Optional<Ticket> optionalTicket = ticketRepository.findById(id);
        return optionalTicket.orElse(null);
    }

    @Override
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicket(Long id) {
        ticketRepository.deleteById(id);
    }

   /* @Override
    public List<Ticket> getTicketsByProjection(Long projectionId) {
        return ticketRepository.findByProjection_Id(projectionId);
    }*/
}
