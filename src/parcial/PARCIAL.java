/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

import java.util.*;
/**
 *
 * @author Estudiantes
 */
public class PARCIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Calculador miCalculador=new Calculador();
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("X1:");
        miCalculador.punto1.setX(miScanner.nextInt());
       
       System.out.println("Y1:");
       
        miCalculador.punto1.setY(miScanner.nextInt());
        
        System.out.println("X2:");
        
        miCalculador.punto2.setX(miScanner.nextInt());
       
       System.out.println("Y2:");
       
        miCalculador.punto2.setY(miScanner.nextInt());
        
        System.out.println(miCalculador.calcularDistancia());
        System.out.println(miCalculador.calcularArea());
        System.out.println(miCalculador.calcularPendiente());
    }
    
}
