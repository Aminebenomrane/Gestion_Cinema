package com.example.cinema_gestion.Controller;

import com.example.cinema_gestion.Controller.Api.TicketApi;
import com.example.cinema_gestion.Models.Ticket;
import com.example.cinema_gestion.Service.Impl.TickerServiceImp;
import com.example.cinema_gestion.Service.TicketService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;
@RestController
public class ControllerTicket implements TicketApi {

    TickerServiceImp tickerServiceImp;
    @Override
    public Ticket save(Ticket ticket) {
        return tickerServiceImp.saveTicket(ticket);
    }

    @Override
    public Optional<Ticket> findById(Long id) {
        return tickerServiceImp.getTicketById(id);
    }

    @Override
    public List<Ticket> findAll() {
        return tickerServiceImp.getAllTickets();
    }

    @Override
    public void delete(Long id) { tickerServiceImp.deleteTicket(id);

    }
}
