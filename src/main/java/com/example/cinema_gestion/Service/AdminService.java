package com.example.cinema_gestion.Service;

import com.example.cinema_gestion.Models.Admin;

import java.util.List;

public interface AdminService {
    List<Admin> getAllAdmins();
    Admin getAdminById(Long id);
    Admin saveAdmin(Admin admin);
    void deleteAdmin(Long id);

}
