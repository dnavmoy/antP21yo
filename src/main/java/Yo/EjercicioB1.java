/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Yo;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author daniel
 */
public class EjercicioB1 {
        public static void main(String[] args) {
        
    
    double REPARACION, totalLunes,totalMartes,totalMiercoles,totalJueves,totalViernes, totalSemana;
    int lunes,martes,miercoles,jueves,viernes;
    REPARACION=32.6;
    String dia;
      
       
        
       
       lunes = entradaDias("lunes");
       martes = entradaDias("martes");
       miercoles = entradaDias("miercoles");
       jueves = entradaDias("jueves");
       viernes = entradaDias("viernes");
       
       
        
        totalLunes = REPARACION*lunes;
        totalMartes = REPARACION*martes;
        totalMiercoles = REPARACION*miercoles;
        totalJueves = REPARACION*jueves;
        totalViernes = REPARACION*viernes;
        totalSemana = totalLunes+totalMartes+totalMiercoles+totalJueves+totalViernes;
        
        System.out.println("""
                            total lunes %.2f
                            total martes %.2f                   
                           total miercoles %.2f
                           total jueves %.2f
                           total viernes %.2f
                           
                           Total Semana %.3f
                         """.formatted(totalLunes,totalMartes,totalMiercoles,totalJueves,totalViernes,totalSemana));
                
        }
        
        public static int entradaDias (String dia){
            int numerodia=0;
            String numero=JOptionPane.showInputDialog("""
                                                      Cuantas reparaciones el día %s
                                                      """.formatted(dia));
            numerodia=Integer.parseInt(numero);
            return numerodia;
            }
        }

