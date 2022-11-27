/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab45.finaltest;

/**
 *
 * @author alvar
 */
public class PassengerNode {
    private Passenger info;
    private PassengerNode link; 
    
    public PassengerNode(){
        this.info = new Passenger();
        this.link = null;
    }
    
    public PassengerNode(Integer age, Integer path){
        this.info = new Passenger(age, path);
        this.link = null;
    }

    /**
     * @return the info
     */
    public Passenger getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(Passenger info) {
        this.info = info;
    }

    /**
     * @return the link
     */
    public PassengerNode getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(PassengerNode link) {
        this.link = link;
    }
    
}