/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab45.finaltest;

/**
 *
 * @author alvar
 */
public class Coach {

    private Integer quantyPassenger;

    public Coach() {
        this.quantyPassenger = 0;
    }
    
    public void passgengerGetOn(Integer quantity) {
        this.quantyPassenger = this.quantyPassenger + quantity;
    }
    
    public void passgengerGetOff(Integer quantity) {
        this.quantyPassenger = this.quantyPassenger - quantity;
    }
    
    public Integer getAvailableSeats(){
        return Constants.PASSENGER_BY_COACH - this.quantyPassenger;
    }

}
