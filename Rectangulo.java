/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areasyperimetros;

import javax.swing.JOptionPane;

/**
 *
 * @author Yulissa Torres
 */
public  class Rectangulo extends Figura{
    private double altura;
    private double base;

    public Rectangulo(double altura, double base) {
        JOptionPane.showMessageDialog(null,"Creando Rectangulo...", "RECTANGULO", JOptionPane.INFORMATION_MESSAGE);
        this.altura = altura;
        this.base = base;
    }
    
 public double area(){
     double area=altura*base;
     return area;
 }
 public double perimetro(){
     double perimetro=2*(altura+base);
     return perimetro;
 }

  
 
}
