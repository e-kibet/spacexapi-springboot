package com.example.demo.repository;

import com.example.demo.models.Landpad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LandpadRepository extends JpaRepository<Landpad, Integer> {
}
