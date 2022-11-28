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

    private Integer totalPassenger;
    private Integer totalChildren;
    private Integer totalCitizen;
    private Integer totalRegular;
    private Integer totalYoung;

    private Double totalChildrenCost;
    private Double totalCitizenCost;
    private Double totalRegularCost;
    private Double totalYoungCost;
    private Double totalCost;

    private PathQueue pathQueue;
    private CoachQueue coachQueue;
    private PassengerStack stack;

    public Train(Integer path, Integer day, Date startTime) {
        this.path = path;
        this.day = day;
        this.totalPassenger = 0;
        this.totalChildren = 0;
        this.totalCitizen = 0;
        this.totalRegular = 0;
        this.totalYoung = 0;
        this.totalChildrenCost = 0.0;
        this.totalCitizenCost = 0.0;
        this.totalRegularCost = 0.0;
        this.totalYoungCost = 0.0;
        this.totalCost = 0.0;
        this.startTime = startTime;
        this.pathQueue = new PathQueue();
        this.stack = new PassengerStack();
        this.coachQueue = new CoachQueue();
    }

    public void start() {

        this.totalPassenger = 0;

        this.connectCoach();

        if (this.path.equals(Constants.PATH_CARTAGO_SAN_JOSE)) {
            this.setPathCartagoSanJose();
        } else {
            this.setPathSanJoseCartago();
        }

        StationNode stationTemp = pathQueue.front();

        while (stationTemp != null) {

            System.out.println("Nombre Estación: " + stationTemp.getInfo().getName());
            PassengerUtil util = new PassengerUtil();

            Integer passengerOnBoard = 0;
            while (passengerOnBoard < util.getTotalPassenger()) {

                CoachNode coachTemp = this.coachQueue.front();
                Integer coachNumber = 1;

                while (coachTemp != null) {

                    if (passengerOnBoard > util.getTotalPassenger()) {
                        break;
                    }

                    System.out.println("    Vagón #" + coachNumber);

                    Integer passengerOnBoardTemp = 0;

                    do {
                        passengerOnBoardTemp = (1 + (int) (Math.random() * (util.getTotalPassenger() - 1)));
                    } while (passengerOnBoardTemp > Constants.PASSENGER_BY_COACH);

                    Integer passengerWaiting = util.getTotalPassenger() - passengerOnBoard;

                    if (passengerWaiting <= passengerOnBoard) {
                        passengerOnBoard = passengerOnBoard + passengerWaiting;

                        passengerOnBoardTemp = passengerWaiting;
                    } else {
                        passengerOnBoard = passengerOnBoard + passengerOnBoardTemp;
                    }

                    Integer total = coachTemp.getInfo().passgengerGetOn(passengerOnBoardTemp);

                    if (!total.equals(0)) {
                        this.totalPassenger += total;
                        System.out.println("        Ingreso pasajeros: " + total);
                        System.out.println("        Sentado pasajeros: " + coachTemp.getInfo().getOccupiedSeats());
                        this.passengerGetOn(total, util.getQuantityChildren(), util.getQuantityRegular(), util.getQuantityCitizen(), util.getQuantityYoung());
                    }

                    coachNumber++;
                    coachTemp = coachTemp.getLink();
                }
            }

            stationTemp = stationTemp.getLink();
        }

        System.out.println("Total pasajeros Transportados: " + this.totalPassenger + "(Niños: " + this.totalChildren + " - Joven: " + this.totalYoung + " - Regular: " + this.totalRegular + " - Adulto mayor: " + this.totalCitizen + ")");
        System.out.println("Total pasajeros Recaudado: " + this.totalCost + "(Niños: " + this.totalChildrenCost + " - Joven: " + this.totalYoungCost + " - Regular: " + this.totalRegularCost + " - Adulto mayor: " + this.totalCitizenCost + ")");

    }

    private void connectCoach() {
        for (Integer coachIndex = 1; coachIndex <= Constants.COACH_BY_TRAIN; coachIndex++) {
            CoachNode coach = new CoachNode();
            this.coachQueue.enqueue(coach);
        }
    }

    private void passengerGetOn(Integer total, Integer quantityChildren, Integer quantityRegular, Integer quantityCitizen, Integer quantityYoung) {

        Integer cont = 0;

        for (Integer quantity = 0; quantity < quantityChildren; quantity++) {

            if (cont > total) {
                break;
            }

            Integer age = Constants.CHILDREN_MIN_AGE + (int) (Math.random() * (Constants.CHILDREN_MAX_AGE - Constants.CHILDREN_MIN_AGE));
            PassengerNode passeger = new PassengerNode(age, this.path);
            this.totalChildren += 1;
            this.totalChildrenCost += passeger.getInfo().getTicketCost();
            this.totalCost += this.totalChildrenCost;
            stack.push(passeger);

            cont++;
        }

        for (Integer quantity = 0; quantity < quantityRegular; quantity++) {
            if (cont > total) {
                break;
            }

            Integer age = Constants.REGULAR_MIN_AGE + (int) (Math.random() * (Constants.REGULAR_MAX_AGE - Constants.REGULAR_MIN_AGE));
            PassengerNode passeger = new PassengerNode(age, this.path);
            this.totalRegular += 1;
            this.totalRegularCost += passeger.getInfo().getTicketCost();
            this.totalCost += this.totalRegularCost;
            stack.push(passeger);

            cont++;
        }

        for (Integer quantity = 0; quantity < quantityCitizen; quantity++) {
            if (cont > total) {
                break;
            }

            Integer age = Constants.CITIZEN_MIN_AGE + (int) (Math.random() * (110 - Constants.CITIZEN_MIN_AGE));
            
            System.out.println("Edad adulto mayor: " + age);
            PassengerNode passeger = new PassengerNode(age, this.path);
            this.totalCitizen += 1;
            this.totalCitizenCost += passeger.getInfo().getTicketCost();
            this.totalCost += this.totalCitizenCost;
            stack.push(passeger);

            cont++;
        }

        for (Integer quantity = 0; quantity < quantityYoung; quantity++) {
            if (cont > total) {
                break;
            }

            Integer age = Constants.YOUNG_MIN_AGE + (int) (Math.random() * (Constants.YOUNG_MAX_AGE - Constants.YOUNG_MIN_AGE));
            PassengerNode passeger = new PassengerNode(age, this.path);
            this.totalYoung += 1;
            this.totalYoungCost += passeger.getInfo().getTicketCost();
            this.totalCost += this.totalYoungCost;
            stack.push(passeger);

            cont++;
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
