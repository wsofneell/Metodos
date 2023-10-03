import java.util.Scanner;

public class Metodo3 {
    static Scanner lector = new Scanner (System.in);
    public static void main (String[] args) throws Exception {
        multiplicarNumeros();
        System.out.println("El producto es " + multiplicarNumeros()); //Para imprimir1
        double resultado = multiplicarNumeros();
        System.out.println("El resultado es " + resultado); //Para imprimir2
    }
    //Declaracion de metodos
    //3. Metodos que no requieren datos de entradas pero si devuelven datos de salida
    public static double multiplicarNumeros(){
        System.out.println("Ingrese num1: ");
        double num1 = lector.nextDouble();
        System.out.println("Ingrese num2: ");
        double num2 = lector.nextDouble();
        double producto = num1 * num2;
        return producto;
    }
}
