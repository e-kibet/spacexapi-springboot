package com.example.demo.repository;

import com.example.demo.models.Payload;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PayloadRepository extends JpaRepository<Payload, Integer> {
}
