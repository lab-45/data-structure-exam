/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab45.finaltest;

/**
 *
 * @author alvar
 */
public class PassengerUtil {

    private Integer quantityChildren;
    private Integer quantityRegular;
    private Integer quantityCitizen;
    private Integer quantityYoung;
    
    public PassengerUtil() {
        this.quantityChildren = (int) (Math.random() * 90);
        this.quantityRegular = (int) (Math.random() * 90);
        this.quantityCitizen = (int) (Math.random() * 90);
        this.quantityYoung = (int) (Math.random() * 90);
    }

    /**
     * @return the quantityChildren
     */
    public Integer getQuantityChildren() {
        return quantityChildren;
    }

    /**
     * @param quantityChildren the quantityChildren to set
     */
    public void setQuantityChildren(Integer quantityChildren) {
        this.quantityChildren = quantityChildren;
    }

    /**
     * @return the quantityRegular
     */
    public Integer getQuantityRegular() {
        return quantityRegular;
    }

    /**
     * @param quantityRegular the quantityRegular to set
     */
    public void setQuantityRegular(Integer quantityRegular) {
        this.quantityRegular = quantityRegular;
    }

    /**
     * @return the quantityCitizen
     */
    public Integer getQuantityCitizen() {
        return quantityCitizen;
    }

    /**
     * @param quantityCitizen the quantityCitizen to set
     */
    public void setQuantityCitizen(Integer quantityCitizen) {
        this.quantityCitizen = quantityCitizen;
    }

    /**
     * @return the quantityYoung
     */
    public Integer getQuantityYoung() {
        return quantityYoung;
    }

    /**
     * @param quantityYoung the quantityYoung to set
     */
    public void setQuantityYoung(Integer quantityYoung) {
        this.quantityYoung = quantityYoung;
    }
}
