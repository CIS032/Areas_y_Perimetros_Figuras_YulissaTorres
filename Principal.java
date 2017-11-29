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
public class Principal {

    public static void main(String[] args) {
        double sumaPerimetros = 0;
        double sumaAreas = 0;

        String menu = "Seleccione una opcion:"
                + "\n1. Circulo. "
                + "\n2. Triangulo."
                + "\n3. Rectangulo."
                + "\n4. Sumar Areas y Perimetros."
                + "\n5. Salir.";
        int opcion = 0;

        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "" + menu, "AREAS Y PERIMETROS", JOptionPane.INFORMATION_MESSAGE));
            switch (opcion) {
                case 1:
                    double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio del circulo: ", "CIRCULO", JOptionPane.INFORMATION_MESSAGE));
                    Circulo circulo = new Circulo(radio);
                    double area = circulo.area();
                    double perimetro = circulo.perimetro();
                    sumaAreas += area;
                    sumaPerimetros += perimetro;
                    JOptionPane.showMessageDialog(null, "El area del circulo es:" + area + "\n y su perimetro es: " + perimetro, "CIRCULO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2:
                    double base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del triangulo: ", "TRIANGULO", JOptionPane.INFORMATION_MESSAGE));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del triangulo: ", "TRIANGULO", JOptionPane.INFORMATION_MESSAGE));
                    Triangulo triangulo = new Triangulo(base, altura);
                    double area1 = triangulo.area();
                    double perimetro1 = triangulo.perimetro();
                    sumaAreas += area1;
                    sumaPerimetros += perimetro1;
                    JOptionPane.showMessageDialog(null, "El area del triangulo es:" + area1 + "\n y su perimetro es: " + perimetro1, "TRIANGULO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 3:
                    base = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la base del rectangulo: ", "RECTANGULO", JOptionPane.INFORMATION_MESSAGE));
                    altura = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la altura del rectangulo: ", "RECTANGULO", JOptionPane.INFORMATION_MESSAGE));
                    Rectangulo rectangulo = new Rectangulo(base, altura);
                    double area2 = rectangulo.area();
                    double perimetro2 = rectangulo.perimetro();
                    sumaAreas += area2;
                    sumaPerimetros += perimetro2;
                    JOptionPane.showMessageDialog(null, "El area del rectangulo es:" + area2 + "\n y su perimetro es: " + perimetro2, "RECTANGULO", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "La suma de las areas y perimetros de las figuras son:\n" + "AreaS: " + sumaAreas + "\nPerimetroS: " + sumaPerimetros, "AREAS Y PERIMETROS TOTALES DE LAS FIGURAS", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 5:
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Ingrese un opcion correcta.", "OPCION NO VALIDA", JOptionPane.ERROR_MESSAGE);
            }
        } while (opcion != 5);
        JOptionPane.showMessageDialog(null, "Saliendo...", "AREAS Y PERIMETROS", JOptionPane.INFORMATION_MESSAGE);

    }

}
