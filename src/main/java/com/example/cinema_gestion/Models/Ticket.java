package com.example.cinema_gestion.Models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor

public class Ticket {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private double prix;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id")
    private Client client;
    @ManyToOne
    @JoinColumn(name="id_film")
    private Film film;


}
