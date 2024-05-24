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
public class Suma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer numero de la suma");
        int n1 = sc.nextInt();
        System.out.println("Introduce el primer numero de la suma");
        int n2 = sc.nextInt();

        System.out.println("El resultado es: " + (n1+n2));

    }
}
