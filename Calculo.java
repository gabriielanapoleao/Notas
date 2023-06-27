/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;

        public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        
        double base=0;
        double altura=0;
    
        System.out.println("Digite o valor da base:");
        base=scanner.nextDouble();
        System.out.println ("Digite o valor da altura:");
        altura=scanner.nextDouble();
        
        double area = (base*altura)/2;
        System.out.println ("Seu resultado "+area);
    }
    
}
