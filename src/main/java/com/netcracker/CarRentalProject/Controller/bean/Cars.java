package com.netcracker.CarRentalProject.Controller.bean;

import java.time.LocalTime;

public class Cars {
    private LocalTime from;
    private LocalTime to;
    private String model;

    public LocalTime getFrom() {
        return from;
    }

    public void setFrom(LocalTime from) {
        this.from = from;
    }

    public LocalTime getTo() {
        return to;
    }

    public void setTo(LocalTime to) {
        this.to = to;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString()
    {
        return "Cars [from=" +from+ ",to=" +to+ ",model=" +model+"]";
    }

}
