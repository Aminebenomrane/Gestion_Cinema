package com.example.cinema_gestion.Service;

import com.example.cinema_gestion.Models.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> getAllTickets();
    Ticket getTicketById(Long id);
    Ticket saveTicket(Ticket ticket);
    void deleteTicket(Long id);
    //List<Ticket> getTicketsByProjection(Long projectionId);
}
