/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab45.finaltest;

/**
 *
 * @author alvar
 */
public class CoachNode {
    private Coach info;
    private CoachNode link; 
    
    public CoachNode(){
        this.info = new Coach();
        this.link = null;
    }

    /**
     * @return the info
     */
    public Coach getInfo() {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(Coach info) {
        this.info = info;
    }

    /**
     * @return the link
     */
    public CoachNode getLink() {
        return link;
    }

    /**
     * @param link the link to set
     */
    public void setLink(CoachNode link) {
        this.link = link;
    }
    
}