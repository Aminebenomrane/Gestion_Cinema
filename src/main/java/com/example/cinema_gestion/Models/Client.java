package com.example.cinema_gestion.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Client extends User{
    private int id ;


    @OneToMany(mappedBy = "client")
    private Collection<Ticket> ticktes;
}
