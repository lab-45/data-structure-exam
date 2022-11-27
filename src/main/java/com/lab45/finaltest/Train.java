/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab45.finaltest;

import java.util.Date;

/**
 *
 * @author alvar
 */
public class Train {

    private Integer path;
    private Integer day;
    private Date startTime;

    private PathQueue pathQueue;

    public Train(Integer path, Integer day, Date startTime) {
        this.path = path;
        this.day = day;
        this.startTime = startTime;
        this.pathQueue = new PathQueue();
    }

    public void start() {

        if (this.path.equals(Constants.PATH_CARTAGO_SAN_JOSE)) {
            this.setPathCartagoSanJose();
        }
        else {
            this.setPathSanJoseCartago();
        }
        
        StationNode temp = pathQueue.front();
        
        while (temp != null){
            
            System.out.println("Nombre Estación: " + temp.getInfo().getName());
            
            temp = temp.getLink();            
        }   
    }
    
     private void passengerGetOn() {

        Integer quantityChildren = (int) Math.random() * 90;
        Integer quantityRegular = (int) Math.random() * 90;
        Integer quantityCitizen = (int) Math.random() * 90;
        Integer quantityYoung = (int) Math.random() * 90;

        PassengerStack stack = new PassengerStack();

        for (Integer quantity = 0; quantity < quantityChildren; quantity++) {
            Integer age = Constants.CHILDREN_MIN_AGE + ((int) Math.random() * Constants.CHILDREN_MAX_AGE);
            PassengerNode passeger = new PassengerNode(age, this.path);
            stack.push(passeger);
        }

        for (Integer quantity = 0; quantity < quantityRegular; quantity++) {
            Integer age = Constants.REGULAR_MIN_AGE + ((int) Math.random() * Constants.REGULAR_MAX_AGE);
            PassengerNode passeger = new PassengerNode(age, this.path);
            stack.push(passeger);
        }

        for (Integer quantity = 0; quantity < quantityCitizen; quantity++) {
            Integer age = Constants.CITIZEN_MIN_AGE + ((int) Math.random() * 110);
            PassengerNode passeger = new PassengerNode(age, this.path);
            stack.push(passeger);
        }

        for (Integer quantity = 0; quantity < quantityYoung; quantity++) {
            Integer age = Constants.YOUNG_MIN_AGE + ((int) Math.random() * Constants.YOUNG_MAX_AGE);
            PassengerNode passeger = new PassengerNode(age, this.path);
            stack.push(passeger);
        }
    }
    
    private void setPathSanJoseCartago() {
        StationNode stationOne = new StationNode(Constants.ESTACION_ATLANTICO, Constants.PATH_SAN_JOSE_CARTAGO);
        this.pathQueue.enqueue(stationOne);

        StationNode stationTwo = new StationNode(Constants.UCR, Constants.PATH_SAN_JOSE_CARTAGO);
        this.pathQueue.enqueue(stationTwo);

        StationNode stationThree = new StationNode(Constants.ULATINA, Constants.PATH_SAN_JOSE_CARTAGO);
        this.pathQueue.enqueue(stationThree);

        StationNode stationFour = new StationNode(Constants.CFIA, Constants.PATH_SAN_JOSE_CARTAGO);
        this.pathQueue.enqueue(stationFour);

        StationNode stationFive = new StationNode(Constants.UACA, Constants.PATH_SAN_JOSE_CARTAGO);
        this.pathQueue.enqueue(stationFive);

        StationNode stationSix = new StationNode(Constants.TRES_RIOS, Constants.PATH_SAN_JOSE_CARTAGO);
        this.pathQueue.enqueue(stationSix);

        StationNode stationSeven = new StationNode(Constants.ESTACION_CARTAGO, Constants.PATH_SAN_JOSE_CARTAGO);
        this.pathQueue.enqueue(stationSeven);

        StationNode stationEight = new StationNode(Constants.LOS_ANGELES, Constants.PATH_SAN_JOSE_CARTAGO);
        this.pathQueue.enqueue(stationEight);
    }

    private void setPathCartagoSanJose() {
        StationNode stationOne = new StationNode(Constants.LOS_ANGELES, Constants.PATH_CARTAGO_SAN_JOSE);
        this.pathQueue.enqueue(stationOne);

        StationNode stationTwo = new StationNode(Constants.ESTACION_CARTAGO, Constants.PATH_CARTAGO_SAN_JOSE);
        this.pathQueue.enqueue(stationTwo);

        StationNode stationThree = new StationNode(Constants.TRES_RIOS, Constants.PATH_CARTAGO_SAN_JOSE);
        this.pathQueue.enqueue(stationThree);

        StationNode stationFour = new StationNode(Constants.UACA, Constants.PATH_CARTAGO_SAN_JOSE);
        this.pathQueue.enqueue(stationFour);

        StationNode stationFive = new StationNode(Constants.CFIA, Constants.PATH_CARTAGO_SAN_JOSE);
        this.pathQueue.enqueue(stationFive);

        StationNode stationSix = new StationNode(Constants.ULATINA, Constants.PATH_CARTAGO_SAN_JOSE);
        this.pathQueue.enqueue(stationSix);

        StationNode stationSeven = new StationNode(Constants.UCR, Constants.PATH_CARTAGO_SAN_JOSE);
        this.pathQueue.enqueue(stationSeven);

        StationNode stationEight = new StationNode(Constants.ESTACION_ATLANTICO, Constants.PATH_CARTAGO_SAN_JOSE);
        this.pathQueue.enqueue(stationEight);
    }
}
