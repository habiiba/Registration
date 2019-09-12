package com.example.RegistrationSystem.Service;

import com.example.RegistrationSystem.Entity.Registration;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface RegistrationService {
    List<Registration> getAll();
    void deleteById(Long id);
    Registration createRegistration(Registration registration);
    Optional<Registration> getById(Long id);
    void updateRegistration(Long id, Registration registrationDto);
    void grantAdmission(Long id);
}
