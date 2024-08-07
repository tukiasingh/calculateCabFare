package com.example.calculatecabfare.service;

import com.example.calculatecabfare.model.CabFare;
import com.example.calculatecabfare.repository.CabFareRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabFareService {

    @Autowired
    CabFareRepository cabFareRepository;

    public List<Double> findCabFareByType(String typeOfCab) {
        return cabFareRepository.findCabFareByType(typeOfCab);
    }

    public List<CabFare> findAll() {
        return cabFareRepository.findAll();
    }

    public List<CabFare> findAllCabs(){
        return cabFareRepository.findAllCabs();
    }
}
