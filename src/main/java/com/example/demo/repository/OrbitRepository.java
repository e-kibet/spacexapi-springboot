package com.example.demo.repository;

import com.example.demo.models.Orbit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrbitRepository extends JpaRepository<Orbit, Integer> {
}
