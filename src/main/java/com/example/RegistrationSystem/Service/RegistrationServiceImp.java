package com.example.RegistrationSystem.Service;

import com.example.RegistrationSystem.Entity.AdmissionStatus;
import com.example.RegistrationSystem.Entity.Registration;
import com.example.RegistrationSystem.Repository.RegistrationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistrationServiceImp implements RegistrationService {

    @Autowired
    private RegistrationRepo repo;

    @Override
    public List<Registration> getAll() { return repo.findAll(); }

    @Override
    public void deleteById(Long id){ repo.deleteById(id); }

    @Override
    public Registration createRegistration(Registration registration) {
        registration.setAdmissionStatus(AdmissionStatus.PENDING);
        return repo.save(registration); }

    @Override
    public Optional<Registration> getById(Long id) {
        return repo.findById(id);
    }

    @Override
    public void updateRegistration(Long id, Registration registrationDto) {
        Optional<Registration> registration = repo.findById(id);
        registration.get().setFirstName(registrationDto.getFirstName());
        registration.get().setLastName(registrationDto.getLastName());
        registration.get().setAddress(registrationDto.getAddress());
        repo.save(registration.get());
    }

    @Override
    public void grantAdmission(Long id){
        Optional<Registration> registration = repo.findById(id);
        registration.get().setAdmissionStatus(AdmissionStatus.ADMITTED);
        repo.save(registration.get());
    }
}
