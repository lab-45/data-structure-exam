/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab45.finaltest;

/**
 *
 * @author alvar
 */
public class Station {

    private Integer station;
    private String name;
    private Integer path;

    public Station() {
    }

    public Station(Integer station, Integer path) {
        this.path = path;
        this.station = station;
        
        if (this.station.equals(Constants.ESTACION_ATLANTICO)) {
            this.name = "Estación Atlántico";
        } else if (this.station.equals(Constants.ESTACION_CARTAGO)) {
            this.name = "Estación Cartago";
        } else if (this.station.equals(Constants.CFIA)) {
            this.name = "CFIA";
        } else if (this.station.equals(Constants.LOS_ANGELES)) {
            this.name = "Los Angeles";
        } else if (this.station.equals(Constants.UACA)) {
            this.name = "UACA";
        } else if (this.station.equals(Constants.ULATINA)) {
            this.name = "ULatina";
        } else if (this.station.equals(Constants.UCR)) {
            this.name = "UCR";
        } else if (this.station.equals(Constants.TRES_RIOS)) {
            this.name = "Tres Ríos";
        }
    }

    public void passengerGetOn() {

        Integer quantityChildren = (int) Math.random() * 90;
        Integer quantityRegular = (int) Math.random() * 90;
        Integer quantityCitizen = (int) Math.random() * 90;
        Integer quantityYoung = (int) Math.random() * 90;

        PassengerStack stack = new PassengerStack();

        for (Integer quantity = 0; quantity < quantityChildren; quantity++) {
            Integer age = Constants.CHILDREN_MIN_AGE + ((int) Math.random() * Constants.CHILDREN_MAX_AGE);
            PassengerNode passeger = new PassengerNode(age, this.getPath());
            stack.push(passeger);
        }

        for (Integer quantity = 0; quantity < quantityRegular; quantity++) {
            Integer age = Constants.REGULAR_MIN_AGE + ((int) Math.random() * Constants.REGULAR_MAX_AGE);
            PassengerNode passeger = new PassengerNode(age, this.getPath());
            stack.push(passeger);
        }

        for (Integer quantity = 0; quantity < quantityCitizen; quantity++) {
            Integer age = Constants.CITIZEN_MIN_AGE + ((int) Math.random() * 110);
            PassengerNode passeger = new PassengerNode(age, this.getPath());
            stack.push(passeger);
        }

        for (Integer quantity = 0; quantity < quantityYoung; quantity++) {
            Integer age = Constants.YOUNG_MIN_AGE + ((int) Math.random() * Constants.YOUNG_MAX_AGE);
            PassengerNode passeger = new PassengerNode(age, this.getPath());
            stack.push(passeger);
        }
    }

    public void passengerGetOff() {
    }

    /**
     * @return the station
     */
    public Integer getStation() {
        return station;
    }

    /**
     * @param station the station to set
     */
    public void setStation(Integer station) {
        this.station = station;
    }

    /**
     * @return the path
     */
    public Integer getPath() {
        return path;
    }

    /**
     * @param path the path to set
     */
    public void setPath(Integer path) {
        this.path = path;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
