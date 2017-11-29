
package areasyperimetros;

import javax.swing.JOptionPane;

/**
 *
 * @author Yulissa Torres
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio) {
        JOptionPane.showMessageDialog(null,"Creando Circulo...", "CIRCULO", JOptionPane.INFORMATION_MESSAGE );
        this.radio = radio;
    }
public double area(){
    double area=Math.PI*Math.pow(radio, 2);
    return area;
}
public double perimetro(){
    double perimetro=2*Math.PI*radio;
    return perimetro;
}
}   
