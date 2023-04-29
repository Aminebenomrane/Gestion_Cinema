package com.example.cinema_gestion.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film {
    @Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id;
    private String titre;
    private String realisateur;
    private String acteur;
    private String genre;
    private Double montant;
    @Temporal(TemporalType.TIMESTAMP)
    private Date heureProjection;
    private String Duree;
    private int anneeSortie;

    @ManyToOne
    @JoinColumn(name="id_salle")
    private Salle salle;
    @JsonIgnore
    @OneToMany(mappedBy="film")
    private Collection<Ticket> tickets;

}
