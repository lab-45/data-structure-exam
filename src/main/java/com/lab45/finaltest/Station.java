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
