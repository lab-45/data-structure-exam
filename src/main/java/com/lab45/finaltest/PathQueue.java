/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lab45.finaltest;

/**
 *
 * @author alvar
 */
public class PathQueue {
    
    private StationNode front;
    private StationNode rear;
    private Integer nodes;
    
    public PathQueue(){
        this.front = null;
        this.rear = null;
        this.nodes = 0;
    }
    
    public boolean isEmpty(){
        return (this.nodes == 0);
    }
    
    public void enqueue(StationNode node){
        if (this.rear != null){
            this.rear.setLink(node);            
        }        
        this.rear = node;
        
        if (this.front == null){
            this.front = node;
        }
        
        this.nodes++;
    }
    
    public StationNode front(){
        return this.front;
    }
}
