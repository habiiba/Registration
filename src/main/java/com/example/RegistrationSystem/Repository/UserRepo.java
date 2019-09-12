package com.example.RegistrationSystem.Repository;

import com.example.RegistrationSystem.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
