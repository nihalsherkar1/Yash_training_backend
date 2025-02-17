package com.productManagement.repository;

import com.productManagement.entity.Register;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegisterRepository extends JpaRepository<Register,Long> {
    Register findByEmail(String email);
}
