package com.netcracker.CarRentalProject.Controller.bean;

import java.sql.Time;
import java.time.LocalTime;


public class Cars {
    private LocalTime fromtime;
    private LocalTime totime;
    private String model;
    private Integer cost;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private Integer id;


    public void setFrom(LocalTime fromtime) {
        this.fromtime = fromtime;
    }
    public LocalTime getFrom() {
        return fromtime;
    }
    public void setTo(LocalTime totime) {
        this.totime = totime;
    }

    public LocalTime getTo() {
        return totime;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setCost(Integer cost) {
        this.cost = cost;
    }
    public Integer getCost() {
        return cost;
    }
    @Override
    public String toString()
    {
        return "Cars [from=" +fromtime+ ",to=" +totime+ ",model=" +model+"]";
    }

}
