/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;

public class UrnaEletronica {

    public static void main(String[] args) {
        final int candidato1 = 77123; //Pedro
        final int candidato2 = 90321; //Maria
        final int candidato3 = 12345; //João
        
         Scanner scanner = new Scanner (System.in);
                
        int votosCandidato1=0;
        int votosCandidato2=0;
        int votosCandidato3=0;
        
        int voto=0;
        
        //A urna eletrônica apresenta três possíveis candidatos
        //com um número correspondente a cada candidato
        do{
            System.out.println("===== ELEIÇÕES 2023 =====\nDigite o número do seu candidato:\n77123 - Pedro\n90321 - Maria\n12345 - João");
       
        //o programa apresenta um campo de entrada de dados para
        // que o usuário digite a escolha do seu candidato
        
        //Após, deve solicitar um novo voto
            voto=scanner.nextInt();
        //Ao digitar o número escolhido, o programa irá somar um
        //voto para o candidato escolhido pelo usuário
        //o programa deve exibir ao usuário uma mensagem que o
        //voto foi computado com sucesso
            if (voto==77123){
                votosCandidato1=votosCandidato1+1;
                System.out.println("Você votou em Pedro.\nSeu voto foi computado com sucesso.");    
            } else if (voto==90321){
                votosCandidato2=votosCandidato2+1;  
                System.out.println("Você votou em Maria.\nSeu voto foi computado com sucesso.");
            } else if(voto==12345){
                votosCandidato3=votosCandidato3+1;
                System.out.println("Você votou em João.\nSeu voto foi computado com sucesso.");
            } else {
                if(voto!=00000){
                System.out.println("Você não digitou um número válido");
                }
            }
        //Quando o mesário digitar a senha secreta, o programa
        //irá parar de disponibilizar votos
        }while(voto!=00000);
        
        System.out.println("A votação encerrou.\nVotos:\nPedro: " +votosCandidato1+"\nMaria: "+votosCandidato2+"\nJoão: " +votosCandidato3);
        
        
        //Logo após parar de disponibilizar votos, o programa deve exibir 
        //a quantidade de votos para cada candidato 
        
        //Ao digitar uma senha que apenas o mesário conhece, o programa
        //irá parar de disponibilizar votos 
    }
}
