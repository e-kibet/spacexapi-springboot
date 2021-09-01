package com.example.demo.controllers;


import com.example.demo.models.Headquarter;
import com.example.demo.services.HeadquarterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/headquarters")
public class HeadquarterController {
    @Autowired
    private HeadquarterService headquarterService;

    @PostMapping
    public @ResponseBody String create(@RequestBody Headquarter headquarter){
        headquarterService.createHeadquarter(headquarter);
        return "Saved";
    }
    @GetMapping
    public Iterable<Headquarter> getHeadquarters(){
        return headquarterService.getHeadQuarters();
    }
}
