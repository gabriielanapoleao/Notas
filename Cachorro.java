/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;

public class Cachorro {
    
    String raca;
    //new fields!
    boolean Brincando;
    int idade;
    
    //new parametrs that correspond to the new fields
    public Cachorro(String cor, boolean movimento, int tempo)
    {
        raca = cor;
        //assign new parameters to the new fields
        Brincando = movimento;
        idade = tempo;
    }
    
    public static void main (String[] args){
        //new values passed into the method call
        Cachorro viralata = new Cachorro("caramelo", true, 3);
        Cachorro golden = new Cachorro ("dourado", false, 5);
        
        System.out.println(viralata.Brincando);
        //true
        System.out.println(golden.idade);
        //5
    }
}