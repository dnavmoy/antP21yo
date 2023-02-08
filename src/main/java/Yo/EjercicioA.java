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
        
    
    double REPARACION, totalLunes;
    int lunes,martes,miercoles,jueves,viernes;
    REPARACION=32.6;
    String dia;
      
       
        
       
        //lunes = entradaDias("lunes");
        //martes = entradaDias("martes");
        lunes= 5;
        martes= 6;
        
        //totalLunes = REPARACION*lunes;
        System.out.println("""
                            total lunes %0.d
                            total martes %0.d                   
                         """.formatted(lunes,martes));
                
        }
        
        public static int entradaDias (String dia){
            int numerodia;
            Scanner entradaTeclado = new Scanner(System.in);
            System.out.println("cuantas reparaciones el?"+ dia);
            numerodia = entradaTeclado.nextInt();
            return numerodia;
            }
        }
}
