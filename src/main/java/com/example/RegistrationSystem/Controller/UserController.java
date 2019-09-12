package com.example.RegistrationSystem.Controller;

import com.example.RegistrationSystem.Entity.User;
import com.example.RegistrationSystem.Service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserServiceImp imp;

    @GetMapping
    List<User> getAllUsers(){ return imp.getAll(); }

    @GetMapping(value = "/{id}")
    Optional<User> getById(@PathVariable( "id") Long id){ return imp.getById(id); }

    @PostMapping
    User createUser(@RequestBody User user){ return imp.createUser(user); }

    @DeleteMapping(value = "/{id}")
    void deleteUserById(@PathVariable( "id" ) Long id){ imp.deleteById(id); }

    @PutMapping(value = "/{id}")
    public void update(@PathVariable( "id" ) Long id, @RequestBody User dto) {
        { imp.updateUser(id, dto); }
    }





}
