package com.example.cinema_gestion.Service;

import com.example.cinema_gestion.Models.Ticket;

import java.util.List;
import java.util.Optional;

public interface TicketService {
    List<Ticket> getAllTickets();
    Optional <Ticket> getTicketById(Long id);
    Ticket saveTicket(Ticket ticket);
    void deleteTicket(Long id);
    //List<Ticket> getTicketsByProjection(Long projectionId);
}
