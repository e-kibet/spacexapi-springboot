package com.example.demo.services;

import com.example.demo.models.Headquarter;
import com.example.demo.payload.HeadquarterResponse;
import com.example.demo.payload.PagedResponse;
import com.example.demo.repository.HeadquarterRepository;
import com.example.demo.utils.AppUtils;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Service
public class HeadquarterService {
    private static final String CREATED_AT = "created_at";

    @Autowired
    private HeadquarterRepository headquarterRepository;

    @Autowired
    private ModelMapper modelMapper;

    public ResponseEntity<Headquarter> createHeadquarter(Headquarter headquarterRequest){
        Headquarter headquarter = new Headquarter();
        modelMapper.map(headquarterRequest, headquarter);
        Headquarter newHeadquarter = headquarterRepository.save(headquarter);
        return new ResponseEntity<>(newHeadquarter, HttpStatus.CREATED);
    }

    public PagedResponse<HeadquarterResponse> getHeadQuarters(int page, int size){
        AppUtils.validatePageNumberAndSize(page, size);

        Pageable pageable = PageRequest.of(page, size, Sort.Direction.DESC, "id");
        /**
         * errror on this line
         */
        Page<Headquarter> headquarters = headquarterRepository.findAll(pageable);

        if (headquarters.getNumberOfElements() == 0) {
            return new PagedResponse<>(headquarters.getNumber(), headquarters.getSize(), headquarters.getTotalElements(),
                    headquarters.getTotalPages(), headquarters.isLast(), Collections.emptyList());
        }
        List<HeadquarterResponse> albumResponses = Arrays.asList(modelMapper.map(headquarters.getContent(), HeadquarterResponse[].class));

        return new PagedResponse<>(headquarters.getNumber(), headquarters.getSize(), headquarters.getTotalElements(), headquarters.getTotalPages(),
                headquarters.isLast(), albumResponses);
    }

}
