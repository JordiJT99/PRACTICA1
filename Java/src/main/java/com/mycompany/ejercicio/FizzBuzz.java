/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio;

import java.util.Scanner;

/**
 *
 * @author Mati
 */
public class FizzBuzz {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero");
        int n=sc.nextInt();
        int contador=1;
        String buzz="buzz";
        String frizz="fizz";
        String fb="fizzbuzz";
        while(contador<=n){
            if (contador%3==0 && contador%5==0){
                System.out.print(fb);
            }
            else if (contador%3==0){
                System.out.print(buzz);
            }
            else if (contador%5==0){
                System.out.print(frizz);
            }
            
            else{
            System.out.print(contador);
           
        } contador++;
        if(contador<=n){
            System.out.print(",");
        }
    }
    }
}
