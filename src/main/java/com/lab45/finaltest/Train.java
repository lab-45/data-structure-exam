/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab45.finaltest;

/**
 *
 * @author alvar
 */
public class Train {
    
    private Integer path;
    private Integer day;
    private PathQueue pathQueue;
    private CoachQueue coachQueue;
    
    public Train(Integer path, Integer day) {
        this.path = path;
        this.day = day;
        this.pathQueue = new PathQueue();
        this.coachQueue = new CoachQueue();
    }
    
    public void start() {
        if (day.equals(Constants.SUNDAY)) {
            System.out.println("El domingo no hay servicio de tren");
            return;
        }
        
        this.connectCoach();
        
        if (this.path.equals(Constants.PATH_CARTAGO_SAN_JOSE)) {
            this.setPathCartagoSanJose();
        } else {
            this.setPathSanJoseCartago();
        }
        
        StationNode stationTemp = pathQueue.front();
        
        while (stationTemp != null) {
            
            System.out.println("Nombre Estación: " + stationTemp.getInfo().getName());
            
            CoachNode coachTemp = this.coachQueue.front();
            
            Integer coachNumber = 1;
            
            while (coachTemp != null) {
                System.out.println("    Vagón #" + coachNumber);
                
                Integer passengerGetOffCoach;
                Integer passengerGetOnCoach;
                
                if (stationTemp.getLink() == null) {
                    passengerGetOffCoach = coachTemp.getInfo().getOccupiedSeats();
                    passengerGetOnCoach = 0;
                } else {
                    passengerGetOffCoach = (int) (Math.random() * coachTemp.getInfo().getOccupiedSeats());
                    passengerGetOnCoach = (int) (Math.random() * coachTemp.getInfo().getAvailableSeats());
                }
                
                for (Integer getOff = 1; getOff <= passengerGetOffCoach; getOff++) {
                    coachTemp.getInfo().getOff();
                }
                
                System.out.println("        Pasajeros bajando: " + passengerGetOffCoach);
                
                for (Integer getOn = 1; getOn <= passengerGetOnCoach; getOn++) {
                    
                    Integer age = Constants.CHILDREN_MIN_AGE + (int) (Math.random() * (Constants.CITIZEN_MAX_AGE - Constants.CHILDREN_MIN_AGE));
                    PassengerNode passeger = new PassengerNode(age, this.path);
                    coachTemp.getInfo().getOn(passeger);
                }
                
                System.out.println("        Pasajeros subiendo: " + passengerGetOnCoach);
                System.out.println("        Pasajeros sentados: " + coachTemp.getInfo().getOccupiedSeats());
                
                coachNumber++;
                coachTemp = coachTemp.getLink();
            }
            
            stationTemp = stationTemp.getLink();
        }
        
        this.resume();
    }
    
    private void resume() {
        CoachNode coachTemp = this.coachQueue.front();
        
        Integer totalPassenger = 0;
        Integer totalChildren = 0;
        Integer totalYoung = 0;
        Integer totalRegular = 0;
        Integer totalCitizen = 0;
        
        Double totalChildrenCost = 0.0;
        Double totalCitizenCost = 0.0;
        Double totalRegularCost = 0.0;
        Double totalYoungCost = 0.0;
        Double totalCost = 0.0;
        
        while (coachTemp
                != null) {
            totalPassenger += coachTemp.getInfo().getTotalChildren() + coachTemp.getInfo().getTotalCitizen() + coachTemp.getInfo().getTotalRegular() + coachTemp.getInfo().getTotalYoung();
            totalChildren += coachTemp.getInfo().getTotalChildren();
            totalYoung += coachTemp.getInfo().getTotalYoung();
            totalRegular += coachTemp.getInfo().getTotalRegular();
            totalCitizen += coachTemp.getInfo().getTotalCitizen();
            
            totalCost += coachTemp.getInfo().getTotalChildrenCost() + coachTemp.getInfo().getTotalCitizenCost() + coachTemp.getInfo().getTotalRegularCost() + coachTemp.getInfo().getTotalYoungCost();
            totalChildrenCost += coachTemp.getInfo().getTotalChildrenCost();
            totalYoungCost += coachTemp.getInfo().getTotalYoungCost();
            totalRegularCost += coachTemp.getInfo().getTotalRegularCost();
            totalCitizenCost += coachTemp.getInfo().getTotalCitizenCost();
            coachTemp = coachTemp.getLink();
        }
        
        System.out.println(
                "Total pasajeros Transportados: " + totalPassenger
                + "(Niños: " + totalChildren + " - Joven: " + totalYoung
                + " - Regular: " + totalRegular + " - Adulto mayor: " + totalCitizen + ")");
        
        System.out.println(
                "Total pasajeros Recaudado: " + totalCost + "(Niños: " + totalChildrenCost + " - Joven: "
                + totalYoungCost + " - Regular: " + totalRegularCost + " - Adulto mayor: " + totalCitizenCost + ")");
    }
    
    private void connectCoach() {
        for (Integer coachIndex = 1; coachIndex <= Constants.COACH_BY_TRAIN; coachIndex++) {
            CoachNode coach = new CoachNode(this.path);
            this.coachQueue.enqueue(coach);
        }
    }
    
    private void setPathSanJoseCartago() {
        addPath(Constants.ESTACION_ATLANTICO, Constants.PATH_SAN_JOSE_CARTAGO);
        addPath(Constants.UCR, Constants.PATH_SAN_JOSE_CARTAGO);
        addPath(Constants.ULATINA, Constants.PATH_SAN_JOSE_CARTAGO);
        addPath(Constants.CFIA, Constants.PATH_SAN_JOSE_CARTAGO);
        addPath(Constants.UACA, Constants.PATH_SAN_JOSE_CARTAGO);
        addPath(Constants.TRES_RIOS, Constants.PATH_SAN_JOSE_CARTAGO);
        addPath(Constants.ESTACION_CARTAGO, Constants.PATH_SAN_JOSE_CARTAGO);
        
        if (!this.day.equals(Constants.SATURDAY)) {
            addPath(Constants.LOS_ANGELES, Constants.PATH_SAN_JOSE_CARTAGO);
        }
    }
    
    private void setPathCartagoSanJose() {
        if (!this.day.equals(Constants.SATURDAY)) {
            addPath(Constants.LOS_ANGELES, Constants.PATH_CARTAGO_SAN_JOSE);
        }
        addPath(Constants.ESTACION_CARTAGO, Constants.PATH_CARTAGO_SAN_JOSE);
        addPath(Constants.TRES_RIOS, Constants.PATH_CARTAGO_SAN_JOSE);
        addPath(Constants.UACA, Constants.PATH_CARTAGO_SAN_JOSE);
        addPath(Constants.CFIA, Constants.PATH_CARTAGO_SAN_JOSE);
        addPath(Constants.ULATINA, Constants.PATH_CARTAGO_SAN_JOSE);
        addPath(Constants.UCR, Constants.PATH_CARTAGO_SAN_JOSE);
        addPath(Constants.ESTACION_ATLANTICO, Constants.PATH_CARTAGO_SAN_JOSE);
    }
    
    private void addPath(Integer station, Integer path) {
        StationNode stationEight = new StationNode(station, path);
        this.pathQueue.enqueue(stationEight);
    }
}
