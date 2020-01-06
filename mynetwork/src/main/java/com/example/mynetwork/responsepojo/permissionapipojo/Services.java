package com.example.mynetwork.responsepojo.permissionapipojo;

import com.google.gson.annotations.Expose;

import java.util.List;

public class Services {

    @Expose
    private List<String> food;
    @Expose
    private List<String> reservation;
    @Expose
    private List<String> spa;

    public List<String> getFood() {
        return food;
    }

    public void setFood(List<String> food) {
        this.food = food;
    }

    public List<String> getReservation() {
        return reservation;
    }

    public void setReservation(List<String> reservation) {
        this.reservation = reservation;
    }

    public List<String> getSpa() {
        return spa;
    }

    public void setSpa(List<String> spa) {
        this.spa = spa;
    }
}
