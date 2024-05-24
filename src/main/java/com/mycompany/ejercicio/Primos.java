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
public class Primos {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero");
        int n = sc.nextInt();
        boolean primo=true;
        
     
        for (int i = 2; i * i <= n; i += 1) {
            if (n % i == 0) {
                primo=false;
               
            }
        }
           if (primo) {
            System.out.println("El numero es primo.");
        } else {
            System.out.println("El numero no es primo.");
        }

        }
     }
    
