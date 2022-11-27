/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab45.finaltest;

/**
 *
 * @author alvar
 */
public class Constants {

    /**
     * Rutas
     */
    public static Integer PATH_SAN_JOSE_CARTAGO = 1;
    public static Integer PATH_CARTAGO_SAN_JOSE = 2;
    
    /**
     * Tipo de pasajero
     */
    public static Integer CHILDREN = 1;
    public static Integer YOUNG = 2;
    public static Integer REGULAR = 3;
    public static Integer CITIZEN = 4;    
    
    /**
     * Rango de edades
     */
    public static Integer CHILDREN_MIN_AGE = 1;
    public static Integer CHILDREN_MAX_AGE = 10;
    public static Integer YOUNG_MIN_AGE = 11;
    public static Integer YOUNG_MAX_AGE = 25;
    public static Integer REGULAR_MIN_AGE = 26;
    public static Integer REGULAR_MAX_AGE = 64;
    public static Integer CITIZEN_MIN_AGE = 65;    
    
    /**
     * Costos de tiquetes por rango de edad y ruta
     */
    public static Double CARTAGO_SAN_JOSE_REGULAR = 600.0;
    public static Double CARTAGO_SAN_JOSE_CITIZEN = 0.0;
    public static Double CARTAGO_SAN_JOSE_CHILDREN = 400.0;
    public static Double CARTAGO_SAN_JOSE_YOUNG = 450.0;        
    public static Double SAN_JOSE_CARTAGO_REGULAR = 700.0;
    public static Double SAN_JOSE_CARTAGO_CITIZEN = 0.0;
    public static Double SAN_JOSE_CARTAGO_CHILDREN = 450.0;
    public static Double SAN_JOSE_CARTAGO_YOUNG = 550.0;
    
    /**
     * Vagones por tren y pasajeros por vagón
     */
    public static Integer COACH_BY_TRAIN = 4;
    public static Integer PASSENGER_BY_COACH = 90;
    
    /**
     * Estaciones
     */
    public static Integer ESTACION_ATLANTICO = 1;
    public static Integer UCR = 2;
    public static Integer ULATINA = 3;
    public static Integer CFIA = 4;
    public static Integer UACA = 5;
    public static Integer TRES_RIOS = 6;
    public static Integer ESTACION_CARTAGO = 7;
    public static Integer LOS_ANGELES = 8;
    
}
