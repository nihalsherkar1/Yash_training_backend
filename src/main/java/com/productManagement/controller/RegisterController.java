package com.productManagement.controller;

import com.productManagement.entity.Register;
import com.productManagement.services.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @PostMapping()
    public ResponseEntity<Register> saveUser(@RequestBody Register register, String email){
        Register saveUser = registerService.saveUser(register,email);

        return  new ResponseEntity<>(saveUser, HttpStatus.CREATED);
    }



}
