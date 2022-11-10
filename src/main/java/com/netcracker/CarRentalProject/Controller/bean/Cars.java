package com.netcracker.CarRentalProject.Controller.bean;

import java.sql.Time;


public class Cars {
    private String fromtime;
    private String totime;
    private String model;
    private Integer cost;
    public void setFrom(String from) {
        this.fromtime = from;
    }
    public String getFrom() {
        return fromtime;
    }
    public void setTo(String to) {
        this.totime = to;
    }

    public String getTo() {
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
