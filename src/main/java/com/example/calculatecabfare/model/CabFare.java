package com.example.calculatecabfare.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CabFare {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String typeOfCab;
    double amount;

    public CabFare() {
    }

    public CabFare(int id, String tyeOfCab, double amount) {
        this.id = id;
        this.typeOfCab = tyeOfCab;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeOfCab() {
        return typeOfCab;
    }

    public void setTypeOfCab(String tyeOfCab) {
        this.typeOfCab = tyeOfCab;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "CabFare{" +
                "id=" + id +
                ", tyeOfCab='" + typeOfCab + '\'' +
                ", amount=" + amount +
                '}';
    }
}
