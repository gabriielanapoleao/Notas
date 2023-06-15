/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;

public class SituacaoChuva {
    
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner (System.in);
        System.out.println("Está chovendo? S/N. ");
       
        String escolha =scanner.next();
       
        if(escolha.toUpperCase().equals("S")){
            System.out.println("Você disse que está chovendo");
        } else if(escolha.toUpperCase().equals("N")){
            System.out.println("Você disse que não está chovendo");
    } 
}
}

