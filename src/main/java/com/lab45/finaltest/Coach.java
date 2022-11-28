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
    private Integer totalChildren;
    private Integer totalCitizen;
    private Integer totalRegular;
    private Integer totalYoung;

    private Integer path;

    private Double totalChildrenCost;
    private Double totalCitizenCost;
    private Double totalRegularCost;
    private Double totalYoungCost;
    private Double totalCost;

    private PassengerStack stack;

    public Coach(Integer path) {
        this.path = path;
        this.totalChildren = 0;
        this.totalCitizen = 0;
        this.totalRegular = 0;
        this.totalYoung = 0;
        this.totalChildrenCost = 0.0;
        this.totalCitizenCost = 0.0;
        this.totalRegularCost = 0.0;
        this.totalYoungCost = 0.0;
        this.totalCost = 0.0;
        this.quantyPassenger = 0;
        this.stack = new PassengerStack();
    }
    
    public void getOn(PassengerNode passenger){
        this.quantyPassenger = this.quantyPassenger + 1;
         stack.push(passenger);
         resume(passenger.getInfo().getType(), passenger.getInfo().getTicketCost());
    }
    public void getOff(){
        this.quantyPassenger = this.quantyPassenger - 1;
         stack.pop();
    }
    
    private void resume(Integer type, Double cost) {        
        if (type.equals(Constants.CHILDREN)) {
            this.totalChildren += 1;
            this.totalChildrenCost += cost;
        }
        else if (type.equals(Constants.REGULAR)) {
            this.totalRegular += 1;
            this.totalRegularCost += cost;
        }
        else if (type.equals(Constants.CITIZEN)) {
            this.totalCitizen += 1;
            this.totalChildrenCost += cost;
        }
        else if (type.equals(Constants.YOUNG)) {
            this.totalYoung += 1;
            this.totalYoungCost += cost;
        }
    }

    public Integer getAvailableSeats() {
        return Constants.PASSENGER_BY_COACH - this.quantyPassenger;
    }

    public Integer getOccupiedSeats() {
        return this.quantyPassenger;
    }

    /**
     * @return the stack
     */
    public PassengerStack getStack() {
        return stack;
    }

    /**
     * @param stack the stack to set
     */
    public void setStack(PassengerStack stack) {
        this.stack = stack;
    }

    /**
     * @return the quantyPassenger
     */
    public Integer getQuantyPassenger() {
        return quantyPassenger;
    }

    /**
     * @param quantyPassenger the quantyPassenger to set
     */
    public void setQuantyPassenger(Integer quantyPassenger) {
        this.quantyPassenger = quantyPassenger;
    }

    /**
     * @return the totalChildren
     */
    public Integer getTotalChildren() {
        return totalChildren;
    }

    /**
     * @param totalChildren the totalChildren to set
     */
    public void setTotalChildren(Integer totalChildren) {
        this.totalChildren = totalChildren;
    }

    /**
     * @return the totalCitizen
     */
    public Integer getTotalCitizen() {
        return totalCitizen;
    }

    /**
     * @param totalCitizen the totalCitizen to set
     */
    public void setTotalCitizen(Integer totalCitizen) {
        this.totalCitizen = totalCitizen;
    }

    /**
     * @return the totalRegular
     */
    public Integer getTotalRegular() {
        return totalRegular;
    }

    /**
     * @param totalRegular the totalRegular to set
     */
    public void setTotalRegular(Integer totalRegular) {
        this.totalRegular = totalRegular;
    }

    /**
     * @return the totalYoung
     */
    public Integer getTotalYoung() {
        return totalYoung;
    }

    /**
     * @param totalYoung the totalYoung to set
     */
    public void setTotalYoung(Integer totalYoung) {
        this.totalYoung = totalYoung;
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
     * @return the totalChildrenCost
     */
    public Double getTotalChildrenCost() {
        return totalChildrenCost;
    }

    /**
     * @param totalChildrenCost the totalChildrenCost to set
     */
    public void setTotalChildrenCost(Double totalChildrenCost) {
        this.totalChildrenCost = totalChildrenCost;
    }

    /**
     * @return the totalCitizenCost
     */
    public Double getTotalCitizenCost() {
        return totalCitizenCost;
    }

    /**
     * @param totalCitizenCost the totalCitizenCost to set
     */
    public void setTotalCitizenCost(Double totalCitizenCost) {
        this.totalCitizenCost = totalCitizenCost;
    }

    /**
     * @return the totalRegularCost
     */
    public Double getTotalRegularCost() {
        return totalRegularCost;
    }

    /**
     * @param totalRegularCost the totalRegularCost to set
     */
    public void setTotalRegularCost(Double totalRegularCost) {
        this.totalRegularCost = totalRegularCost;
    }

    /**
     * @return the totalYoungCost
     */
    public Double getTotalYoungCost() {
        return totalYoungCost;
    }

    /**
     * @param totalYoungCost the totalYoungCost to set
     */
    public void setTotalYoungCost(Double totalYoungCost) {
        this.totalYoungCost = totalYoungCost;
    }

    /**
     * @return the totalCost
     */
    public Double getTotalCost() {
        return totalCost;
    }

    /**
     * @param totalCost the totalCost to set
     */
    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

}
