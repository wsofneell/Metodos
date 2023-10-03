import java.util.Scanner;

public class Metodo4 {
    static Scanner lector = new Scanner (System.in);
    public static void main (String[] args) throws Exception {
        validarNumeros(5, 8); // Sin imprimir
        int x = (int)Math.round(Math.random() * 100);
        int y = (int)Math.round(Math.random() * 100);
        System.out.println("El numero " + x + " es menor que " + y + " ? " + (validarNumeros(x, y) ? "Verdadero" : "Falso"));
    }
    //Declaracion de metodos
    //4. Metodos que requieren datos de entrada y devuelven datos de salida
    public static boolean validarNumeros(int a, int b){

        return (a < b);
    }

    
}
