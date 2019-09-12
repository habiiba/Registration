package com.example.RegistrationSystem.Repository;

import com.example.RegistrationSystem.Entity.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration, Long> {
}
