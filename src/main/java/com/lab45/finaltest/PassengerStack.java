/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab45.finaltest;

/**
 *
 * @author alvar
 */
public class PassengerStack {
    
    private PassengerNode top;
    private Integer nodes;
    
    public PassengerStack(){
        this.top = null;
        this.nodes = 0;
    }
    
    public boolean isEmpty(){
        return (this.nodes == 0);
    }
    
    public void push(PassengerNode node){
        if (this.top == null){
            this.top = node;
        }
        else{
            node.setLink(this.top);
            this.top = node;
        }
        
        this.nodes++;
    }
    
    public PassengerNode top(){
        return this.top;
    }
    
    public PassengerNode pop(){
        PassengerNode temp = null;
        
        if (this.nodes > 0){
            temp = this.top;
            this.top = this.top.getLink();
            this.nodes--;
        }
        
        return temp;
    }
}
