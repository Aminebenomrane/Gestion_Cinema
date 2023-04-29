package com.example.cinema_gestion.Service;

import com.example.cinema_gestion.Models.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();
    User getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
}

