import java.util.Scanner;

public class Metodo1 { 
    static Scanner lector = new Scanner (System.in);
    public static void main(String[] args) throws Exception {
       sumarNumeros();
    }
    //Declaracion de metodos
    //1. Metodos que no requieren datos de entrada ni devuelven datos de salida
    public static void sumarNumeros(){
        System.out.println("Ingrese num1: ");
        double num1 = lector.nextDouble();
        System.out.println("Ingrese num2: ");
        double num2 = lector.nextDouble();
        System.out.println("La suma de " + num1 + " y " + num2 + " = " + (num1 + num2));
    }

}