package com.netcracker.CarRentalProject.Controller.bean;

import java.sql.Time;
import java.time.LocalTime;


public class Cars {
    private LocalTime fromtime;
    private LocalTime totime;
    private String model;
    private Integer cost;
    private Integer id;
    private Integer regnum;
    private Boolean stat;

    public Boolean getStatus() {
        return stat;
    }

    public void setStatus(Boolean stats) {
        this.stat = stats;
    }

    public Integer getRegnum() {
        return regnum;
    }

    public void setRegnum(Integer regnum) {
        this.regnum = regnum;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }




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
    public String toString() {
        return "Cars{" +
                "fromtime=" + fromtime +
                ", totime=" + totime +
                ", model='" + model +
                ", cost=" + cost +
                ", id=" + id +
                '}';
    }
}
