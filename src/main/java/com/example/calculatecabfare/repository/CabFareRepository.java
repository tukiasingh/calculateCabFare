package com.example.calculatecabfare.repository;


import com.example.calculatecabfare.model.CabFare;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CabFareRepository extends JpaRepository<CabFare, Integer> {

    @Query("select amount from CabFare where typeOfCab>:typeOfCab")
    public List<Double> findCabFareByType(@Param("typeOfCab") String typeOfCab);

    @Query("select typeOfCab from CabFare")
    public List<CabFare> findAllCabs();

}
