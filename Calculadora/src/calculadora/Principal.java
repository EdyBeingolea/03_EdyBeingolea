package calculadora;


public class Principal {

    public static void main(String[] args) {
        
        Calculadora c1 = new Calculadora();
        
        c1.ingresarDatos();
        c1.sumar();
        c1.restar();
        c1.multiplicar();
        c1.dividir();
        c1.mostrarDatos();
    }
}
