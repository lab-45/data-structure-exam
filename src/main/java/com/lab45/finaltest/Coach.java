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
    
    public Integer passgengerGetOn(Integer quantity) {
        Integer temp = this.quantyPassenger + quantity;
        
        if (temp <= Constants.PASSENGER_BY_COACH)
        {
            this.quantyPassenger = this.quantyPassenger + quantity;
        }
        else if (this.quantyPassenger < Constants.PASSENGER_BY_COACH)
        {
            Integer diff = Constants.PASSENGER_BY_COACH - this.quantyPassenger;
            
            if (quantity < diff){
                this.quantyPassenger = this.quantyPassenger + quantity;
            }else{
                this.quantyPassenger = this.quantyPassenger + diff; 
                quantity = diff;
            }           
        }
        
        return quantity;
    }
    
    public void passgengerGetOff(Integer quantity) {
        this.quantyPassenger = this.quantyPassenger - quantity;
    }
    
    public Integer getAvailableSeats(){
        return Constants.PASSENGER_BY_COACH - this.quantyPassenger;
    }
    
     public Integer getOccupiedSeats(){
        return this.quantyPassenger;
    }

}
