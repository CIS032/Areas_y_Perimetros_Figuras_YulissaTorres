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
public class Triangulo extends Figura{
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        JOptionPane.showMessageDialog(null,"Creando Triangulo...", "TRIANGULO", JOptionPane.INFORMATION_MESSAGE);
        this.base = base;
        this.altura = altura;
    }
public double area(){
    double area=(base*altura)/2;
    return area;
}
public double perimetro(){
    double perimetro=base+(altura*2);
    return perimetro;
}
}
