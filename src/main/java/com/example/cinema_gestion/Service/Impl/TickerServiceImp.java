package com.example.cinema_gestion.Service.Impl;

import com.example.cinema_gestion.Dao.TicketRepository;
import com.example.cinema_gestion.Models.Ticket;
import com.example.cinema_gestion.Service.TicketService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Slf4j
public class TickerServiceImp implements TicketService {
    @Autowired
private TicketRepository ticketRepository;

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    @Override
    public Optional <Ticket> getTicketById(Long id) {
        return ticketRepository.findById(id);

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
