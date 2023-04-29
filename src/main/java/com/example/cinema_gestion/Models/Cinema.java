package com.example.cinema_gestion.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cinema {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;
        private String name;
        private String adress;
        @OneToMany(mappedBy = "cinema")
        private Collection<Salle> salles;
        @OneToMany(mappedBy = "cinema")
        private Collection<Film> films;
    }

