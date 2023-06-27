/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

public class Car {
    String color;
    //new fields!
    boolean isRunning;
    int velocity;
    
    //new parametrs that correspond to the new fields
    public Car(String carColor, boolean carRunning, int milesPerHour)
    {
        color = carColor;
        //assign new parameters to the new fields
        isRunning = carRunning;
        velocity = milesPerHour;
    }
    
    public static void main (String[] args){
        //new values passed into the method call
        Car ferrari = new Car("red", true, 27);
        Car renault = new Car("blue", false, 70);
        
        System.out.println(renault.isRunning);
        //false
        System.out.println(ferrari.velocity);
        //27
    }
}
