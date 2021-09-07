package com.example.demo.repository;

import com.example.demo.models.Rocket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RocketRepository extends JpaRepository<Rocket, Integer> {
}
