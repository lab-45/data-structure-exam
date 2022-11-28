/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab45.finaltest;

/**
 *
 * @author alvar
 */
public class Passenger {

    private Integer age;
    private Integer type;
    private Double ticketCost;
    private Integer path;

    public Passenger() {
    }

    public Passenger(Integer age, Integer path) {
        this.age = age;
        this.path = path;
        this.validatePassengerType();
        this.validateTicketCost();
    }

    private void validatePassengerType() {
        if (this.age >= Constants.CHILDREN_MIN_AGE && this.age <= Constants.CHILDREN_MAX_AGE) {
            this.type = Constants.CHILDREN;

        } else if (this.age >= Constants.YOUNG_MIN_AGE && this.age <= Constants.YOUNG_MAX_AGE) {
            this.type = Constants.YOUNG;

        } else if (this.age >= Constants.REGULAR_MIN_AGE && this.age <= Constants.REGULAR_MAX_AGE) {
            this.type = Constants.REGULAR;

        } else if (this.age >= Constants.CITIZEN_MIN_AGE) {
            this.type = Constants.CITIZEN;
        }
    }

    private void validateTicketCost() {
        if (this.path.equals(Constants.PATH_SAN_JOSE_CARTAGO)) {
            if (this.type.equals(Constants.CHILDREN)) {
                this.ticketCost = Constants.SAN_JOSE_CARTAGO_CHILDREN;
            } else if (this.type.equals(Constants.YOUNG)) {
                this.ticketCost = Constants.SAN_JOSE_CARTAGO_YOUNG;
            } else if (this.type.equals(Constants.REGULAR)) {
                this.ticketCost = Constants.SAN_JOSE_CARTAGO_REGULAR;
            } else if (this.type.equals(Constants.CITIZEN)) {
                this.ticketCost = Constants.SAN_JOSE_CARTAGO_CITIZEN;
            }
        } else if (this.path.equals(Constants.PATH_CARTAGO_SAN_JOSE)) {
            if (this.type.equals(Constants.CHILDREN)) {
                this.ticketCost = Constants.CARTAGO_SAN_JOSE_CHILDREN;
            } else if (this.type.equals(Constants.YOUNG)) {
                this.ticketCost = Constants.CARTAGO_SAN_JOSE_YOUNG;
            } else if (this.type.equals(Constants.REGULAR)) {
                this.ticketCost = Constants.CARTAGO_SAN_JOSE_REGULAR;
            } else if (this.type.equals(Constants.CITIZEN)) {
                this.ticketCost = Constants.CARTAGO_SAN_JOSE_CITIZEN;
            }
        }
    }

    /**
     * @return the age
     */
    public Integer getAge() {
        return age;
    }

    /**
     * @return the type
     */
    public Integer getType() {
        return type;
    }

    /**
     * @return the ticketCost
     */
    public Double getTicketCost() {
        return ticketCost;
    }

    /**
     * @return the path
     */
    public Integer getPath() {
        return path;
    }
}
