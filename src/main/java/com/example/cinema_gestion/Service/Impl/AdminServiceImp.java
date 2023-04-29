package com.example.cinema_gestion.Service.Impl;

import com.example.cinema_gestion.Dao.AdminRepository;
import com.example.cinema_gestion.Models.Admin;
import com.example.cinema_gestion.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class AdminServiceImp implements AdminService {

private AdminRepository adminRepository ;
    @Autowired

    @Override
    public List<Admin> getAllAdmins() {
        return adminRepository.findAll();
    }

    @Override
    public Admin getAdminById(Long id) {
        Optional<Admin> optionalAdmin = adminRepository.findById(id);
        return optionalAdmin.orElse(null);
    }

    @Override
    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public void deleteAdmin(Long id) {
        adminRepository.deleteById(id);
    }}
