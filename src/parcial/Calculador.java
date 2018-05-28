/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author Estudiantes
 */
public class Calculador implements ICalculador {

    Punto punto1 = new Punto();
    Punto punto2 = new Punto();
    
     @Override
    public double calcularDistancia() {
        int dx = (punto2.getX() - punto1.getX());
        int dy = (punto2.getY() - punto1.getY());

        return Math.sqrt((Math.pow(dx,2))+ ((Math.pow(dy,2))));
        
    }
    
    @Override
    
    public double calcularArea() {
        
        int dx = (punto2.getX() - punto1.getX());
        int dy = (punto2.getY() - punto1.getY());
        
        double dx2 = Math.pow(dx ,2);
        double dy2 = Math.pow(dy, 2);
        
        double triangulo = (dx2*dy2)/2;
        double rectangulo = (dx2*dy2);
        return triangulo + rectangulo;
               
  
    }

    @Override
    public double calcularPendiente() {
    int m = ((punto2.getY() - punto1.getY())/(punto2.getX() - punto1.getX()));
    
return m;
    }

}
