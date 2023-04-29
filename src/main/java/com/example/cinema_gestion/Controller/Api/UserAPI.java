package com.example.cinema_gestion.Controller.Api;

import com.example.cinema_gestion.Models.User;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.example.cinema_gestion.Utils.Constants.Api_Root;

public interface UserAPI {
    @PostMapping(value = Api_Root + "/utilisateurs/create")
    User save(@RequestBody User user);
    @GetMapping(value = Api_Root + "/utilisateurs/{iduser}")
    User findById(@PathVariable("iduser") Long id);
    @GetMapping(value = Api_Root + "/utilisateurs/All")
    List<User> findAll();
    @DeleteMapping(value = Api_Root + "/utilisateurs/delete/{iduser}")
    void delete(@PathVariable("iduser") Long id);
}

