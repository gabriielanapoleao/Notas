/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Sobremesa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
      
        System.out.println ("Qual sobremesa você deseja?(1-Bombom,2-Pudim ou 3-Café):  ");
               
            String escolha= scanner.next();
        
        switch (escolha){
            case "1":{
            System.out.println("Você escolheu Bombom");
            break;
        }   case "2":{
            System.out.println("Você escolheu Pudim");
            break;
        }   case "3":{
            System.out.println("Você escolheu Café");
        } break;
    }   
}
}
