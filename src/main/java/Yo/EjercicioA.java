/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yo;

import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class EjercicioA {
        public static void main(String[] args) {
        
    
    double REPARACION, totalLunes,totalMartes;
    int lunes,martes,miercoles,jueves,viernes;
    REPARACION=32.6;
    String dia;
      
       
        
       
       lunes = entradaDias("lunes");
       martes = entradaDias("martes");
       
       
        
        totalLunes = REPARACION*lunes;
        totalMartes = REPARACION*martes;
        System.out.println("""
                            total lunes %.2f
                            total martes %.2f                   
                         """.formatted(totalLunes,totalMartes));
                
        }
        
        public static int entradaDias (String dia){
            int numerodia;
            Scanner entradaTeclado = new Scanner(System.in);
            System.out.println("cuantas reparaciones el "+ dia);
            numerodia = entradaTeclado.nextInt();
            return numerodia;
            }
        }
}
