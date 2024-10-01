package com.demo.Controller;

import com.demo.Entity.Registration;
import com.demo.Service.RegistrationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

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
}
