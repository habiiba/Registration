package com.example.RegistrationSystem.Service;

import com.example.RegistrationSystem.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    List<User> getAll();
    void deleteById(Long id);
    User createUser(User user);
    Optional<User> getById(Long id);
    void updateUser(Long id, User userDto);

}
