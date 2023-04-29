package com.example.cinema_gestion.Dao;

import com.example.cinema_gestion.Models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}
