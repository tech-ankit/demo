package com.demo.Service;

import com.demo.Entity.Registration;
import com.demo.Repository.RegistrationRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RegistrationService {
    private RegistrationRepository registrationRepository;

    public List<Registration> getAllReg() {
        return registrationRepository.findAll();
    }

    public Registration createReg(Registration registration) {
        return registrationRepository.save(registration);
    }

    public String deleteReg(long id) {
        registrationRepository.deleteById(id);
        return "Record Deleted";
    }
}
