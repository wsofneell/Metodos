import java.util.Scanner;

public class MetodoSobrecargados {
    static Scanner lector = new Scanner (System.in);

    public static void main (String []args) throws Exception {
        //Metodos Sobrecargados: 
        //Consiste en utilizar el nombre de un metodo pero
        //con distintas listas de parametros de entradas
        mostrarHora();
        mostrarHora(2,15,36);
        mostrarHora(2,0);
    }
    //Declaracion de metodos
    public static void mostrarHora(){ //Version sin parametro de entrada
        System.out.print("Horas: ");
        int hrs = lector.nextInt();
        System.out.print("Minutos: ");
        int min = lector.nextInt();
        System.out.print("Segundos: ");
        int seg = lector.nextInt();
        System.out.print(" La hora es " + hrs + ":" + min + ":" + seg);
    }
    //Sobrecargar metodo mostrarHora()
    public static void mostrarHora(int hrs, int min, int seg){
        System.out.print(" La hora es " + hrs + ":" + min + ":" + seg);
    }
    public static void mostrarHora(int hrs, int min){
        System.out.print(" La hora es " + hrs + ":" + min + ":" + seg);
    }

}