package com.productManagement.services.impl;

import com.productManagement.entity.Register;
import com.productManagement.repository.RegisterRepository;
import com.productManagement.services.services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private RegisterRepository registerRepository;

    @Override
    public Register saveUser(Register register, String email) {

        Register existedUser= registerRepository.findByEmail(email);

        if (existedUser == null){

            return  registerRepository.save(register);
        }else{
           throw  new RuntimeException("Something went wrong...");
        }



    }
}
