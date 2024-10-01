package com.demo.Controller;

import com.demo.Entity.Registration;
import com.demo.Service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/registration/v1/api")
public class RegistrationController {
    private RegistrationService registrationService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Registration> getAllRegs(
    ){
        return registrationService.getAllReg();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Registration createRegistration(
            @RequestBody Registration registration
    ){
        return registrationService.createReg(registration);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public String deleteRegistration(
            @RequestParam long id
    ){
        return registrationService.deleteReg(id);
    }
}
