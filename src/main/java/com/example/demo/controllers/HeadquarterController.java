package com.example.demo.controllers;


import com.example.demo.models.Headquarter;
import com.example.demo.payload.HeadquarterResponse;
import com.example.demo.payload.PagedResponse;
import com.example.demo.services.HeadquarterService;
import com.example.demo.utils.AppConstants;
import com.example.demo.utils.AppUtils;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="api/v1/headquarters")
@AllArgsConstructor
public class HeadquarterController {
    @Autowired
    private HeadquarterService headquarterService;

    @PostMapping
    public @ResponseBody String create(@RequestBody Headquarter headquarter){
        headquarterService.createHeadquarter(headquarter);
        return "Saved";
    }
    @GetMapping
    public PagedResponse<HeadquarterResponse> getHeadquarters(
            @RequestParam(name = "page", required = false, defaultValue = AppConstants.DEFAULT_PAGE_NUMBER) Integer page,
            @RequestParam(name = "size", required = false, defaultValue = AppConstants.DEFAULT_PAGE_SIZE) Integer size
    ){
        AppUtils.validatePageNumberAndSize(page, size);
        return headquarterService.getHeadQuarters(page, size);
    }
}
