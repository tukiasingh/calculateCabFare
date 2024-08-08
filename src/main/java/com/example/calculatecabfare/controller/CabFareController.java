package com.example.calculatecabfare.controller;


import com.example.calculatecabfare.model.CabFare;
import com.example.calculatecabfare.service.CabFareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cab")
public class CabFareController {

    @Autowired
    CabFareService cabFareService;

    @GetMapping(path="/all")
    public List<String> allCabs() {
        return cabFareService.findAllCabs();
    }

    @GetMapping(value = "findCabFareByType/{typeOfCab}",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Double> findCabFareByType(@PathVariable("typeOfCab") String typeOfCab){
        return cabFareService.findCabFareByType(typeOfCab);
    }


}
