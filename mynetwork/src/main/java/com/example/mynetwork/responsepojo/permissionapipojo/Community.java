package com.example.mynetwork.responsepojo.permissionapipojo;

import com.google.gson.annotations.Expose;

import java.util.List;

public class Community {


    @Expose
    private List<String> features;
    @Expose
    private Services services;

    public List<String> getFeatures() {
        return features;
    }

    public void setFeatures(List<String> features) {
        this.features = features;
    }

    public Services getServices() {
        return services;
    }

    public void setServices(Services services) {
        this.services = services;
    }
}
