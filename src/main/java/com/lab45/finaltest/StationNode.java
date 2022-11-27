/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab45.finaltest;

/**
 *
 * @author alvar
 */
public class StationNode {
    private Station info;
    private StationNode link; 
    
    public StationNode(){
        this.info = new Station();
        this.link = null;
    }
    
    public StationNode(Integer station, Integer path){
        this.info = new Station(station, path);
        this.link = null;
    }

    /**
     * @return the info
     */
    public Station getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(Station info) {
        this.info = info;
    }

    /**
     * @return the link
     */
    public StationNode getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(StationNode link) {
        this.link = link;
    }
    
}