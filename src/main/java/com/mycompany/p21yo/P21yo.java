/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.p21yo;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class P21yo {

    public static void main(String[] args) {
        
        double REPARACION, totalLunes;
        int lunes,martes,miercoles,jueves,viernes;
        REPARACION=32.6;
        
       
        
        Scanner entradaTeclado = new Scanner(System.in);
        System.out.println("cuantas reparaiones el lunes?");
        lunes = entradaTeclado.nextInt();
        
        totalLunes = REPARACION*lunes;
        System.out.println("Total euros hasta el lunes:" + totalLunes);
    }
}
