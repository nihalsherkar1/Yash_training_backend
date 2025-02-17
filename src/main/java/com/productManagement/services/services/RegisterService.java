package com.productManagement.services.services;

import com.productManagement.entity.Register;

public interface RegisterService {
    Register saveUser(Register register,String email);
}
