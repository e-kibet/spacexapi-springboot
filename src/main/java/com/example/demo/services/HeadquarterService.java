package com.example.demo.services;

import com.example.demo.models.Headquarter;
import com.example.demo.repository.HeadquarterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HeadquarterService {
    @Autowired
    private HeadquarterRepository headquarterRepository;

    public void createHeadquarter(Headquarter headquarter){
        headquarterRepository.save(headquarter);
    }

    public Iterable<Headquarter> getHeadQuarters(){
        return headquarterRepository.findAll();
    }

}
