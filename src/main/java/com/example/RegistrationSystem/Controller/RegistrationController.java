package com.example.RegistrationSystem.Controller;

import com.example.RegistrationSystem.Entity.Registration;
import com.example.RegistrationSystem.Service.RegistrationServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {
    @Autowired
    private RegistrationServiceImp imp;

    @GetMapping
    List<Registration> getAllRegistrations() { return imp.getAll(); }

    @GetMapping("/{id}")
    Optional<Registration> getRegistrationById(@PathVariable ( "id" ) Long id){ return imp.getById(id); }

    @PostMapping
    Registration createRegistration(@RequestBody Registration registration){ return imp.createRegistration(registration);}

    @DeleteMapping("/{id}")
    void deleteRegistration(@PathVariable ("id") Long id){ imp.deleteById(id); }

    @PutMapping("/{id}")
    void updateUser(@PathVariable ("id") Long id, @RequestBody Registration registrationDto){
        imp.updateRegistration(id, registrationDto);
    }

    @PatchMapping("/{id}/grantAdmission")
    void grantAdmission(@PathVariable ("id") Long id){
        imp.grantAdmission(id);
    }
}
