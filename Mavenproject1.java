/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

/**
 *
 * @author senai
 */
public class Mavenproject1 {

    public static void main(String[] args){
        System.out.println("count");
        int count=1;
        do{
            count=count+1;
            if (count==3){
                break;
            }
            System.out.println(count);
        }while(count<5);
    }
}


