/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.lab45.finaltest;

/**
 *
 * @author alvar
 */
public class Main {

    public static void main(String[] args) {
        
        PassengerStack stack = new PassengerStack();
        PassengerNode node1 = new PassengerNode(5, Constants.PATH_SAN_JOSE_CARTAGO);
        PassengerNode node2 = new PassengerNode(28, Constants.PATH_SAN_JOSE_CARTAGO);
        PassengerNode node3 = new PassengerNode(90, Constants.PATH_SAN_JOSE_CARTAGO);
        PassengerNode node4 = new PassengerNode(15, Constants.PATH_CARTAGO_SAN_JOSE);
        PassengerNode node7 = new PassengerNode(14, Constants.PATH_SAN_JOSE_CARTAGO);
        PassengerNode node5 = new PassengerNode(30, Constants.PATH_CARTAGO_SAN_JOSE);
        PassengerNode node6 = new PassengerNode(65, Constants.PATH_CARTAGO_SAN_JOSE);
        
        stack.push(node1);
        stack.push(node2);
        stack.push(node3);        
        stack.push(node4);
        stack.push(node7);
        stack.push(node5);
        stack.push(node6);
        
        PassengerNode temp = stack.top();
        
        while (temp != null){
            
            System.out.println("Edad: " + temp.getInfo().getAge() +"  " + "Costo Tiquete: " + temp.getInfo().getTicketCost() +"  " + "Tipo: " + (temp.getInfo().getPath() == Constants.PATH_SAN_JOSE_CARTAGO? "San Jose - Cartago":"Cartago - San José") );
            
            temp = temp.getLink();            
        }   
    }
}
