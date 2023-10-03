import java.util.Scanner;

public class Metodo2 {
    static Scanner lector = new Scanner (System.in);
    public static void main (String[] args) throws Exception {
        System.out.println("Ingrese num1: ");
        double num1 = lector.nextDouble();
        System.out.println("Ingrese num2: ");
        double num2 = lector.nextDouble();
        restarNumeros(num1,num2);
    }
    //Declaracion de metodos
    //2. Metodos que no requieren datos de entrada pero no devuelven datos de salida
    public static void restarNumeros(double a, double b){
        System.out.println("La resta de " + a + " y " + b + " = " + (a-b));
    }

}
