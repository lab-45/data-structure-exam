/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.lab45.finaltest;

import java.util.Date;

/**
 *
 * @author alvar
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("--------------");
        System.out.println("Cartago - San José (Entre Semana)");
        Train trainCartagoSanJose = new Train(Constants.PATH_CARTAGO_SAN_JOSE, Constants.MONDAY);
        trainCartagoSanJose.start();

        System.out.println("--------------");
        System.out.println("Cartago - San José (Sabado)");
        trainCartagoSanJose = new Train(Constants.PATH_CARTAGO_SAN_JOSE, Constants.SATURDAY);
        trainCartagoSanJose.start();

        System.out.println("--------------");
        System.out.println("Cartago - San José (Domingo)");
        trainCartagoSanJose = new Train(Constants.PATH_CARTAGO_SAN_JOSE, Constants.SUNDAY);
        trainCartagoSanJose.start();
    }
}
