package com.example.cinema_gestion.Controller;

import com.example.cinema_gestion.Controller.Api.UserAPI;
import com.example.cinema_gestion.Models.User;
import com.example.cinema_gestion.Service.UserService;

import java.util.List;

public class ControllerUser implements UserAPI {
    UserService userService;
    @Override
    public User save(User user) {
        return userService.saveUser(user);
    }

    @Override
    public User findById(Long id) {
        return userService.getUserById(id);
    }

    @Override
    public List<User> findAll() {
        return userService.getAllUsers();
    }

    @Override
    public void delete(Long id) {
         userService.deleteUser(id);

    }
}
