package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    int num1;
    int num2;
    double suma, resta, multiplicacion, division;

    public void sumar() {
        suma = num1 + num2;
    }

    public void restar() {
        resta = num1 - num2;
    }

    public void multiplicar() {
        multiplicacion = num1 * num2;
    }

    public void dividir() {
        division = num1 / num2;
    }

    public void ingresarDatos() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingere el primer numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingere el segundo numero"));
    }

    public void mostrarDatos() {
        JOptionPane.showMessageDialog(null, "La suma es: " + suma + "\nLa resta es: " + resta + "\nLa multiplicacion es: "+ multiplicacion  +"\nLa division es: " + division);

    }
}
