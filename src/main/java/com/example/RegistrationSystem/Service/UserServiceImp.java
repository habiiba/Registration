package com.example.RegistrationSystem.Service;

import com.example.RegistrationSystem.Entity.User;
import com.example.RegistrationSystem.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepo repo;

    @Override
    public List<User> getAll() {
        return repo.findAll();
    }

    @Override
    public void deleteById(Long id) { repo.deleteById(id);}

    @Override
    public User createUser(User user) {
        return repo.save(user);
    }

    @Override
    public Optional<User> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void updateUser(Long id, User userDto) {
        Optional<User> user =  repo.findById(id);
        user.get().setUserName(userDto.getUserName());
        user.get().setPassword(userDto.getPassword());
        user.get().setEmail(userDto.getEmail());
        repo.save(user.get());
    }
}
