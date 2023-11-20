import java.util.Scanner;

public class App {
    static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        do {
            try {
                Estudiante[] estudiantes = obtenerDatos();
                mostrarActa(estudiantes);
                mostrarEst(estudiantes);

                System.out.print("¿Desea utilizar la aplicación de nuevo? (S/N): ");
                char resp = lector.next().charAt(0);
            } catch (Exception e) {
                System.out.println("Error: Ingrese un valor valido.");
            }
        } while (resp == 'S' || resp == 's'); // Aca

        lector.close();

    } // main

    public static Estudiante[] obtenerDatos() {

        System.out.print("Curso:\t\t ");
        String nombreCurso = lector.nextLine();
        System.out.print("Período lectivo: ");
        String periodoLectivo = lector.nextLine();
        System.out.print("Carrera: ");
        String Carrera = lector.nextLine();
        System.out.print("Modalidad: ");
        String Modalidad = lector.nextLine();
        System.out.print("Cod. Curso: ");
        String codigoCurso = lector.nextLine();
        System.out.print("Grupo: ");
        String Grupo = lector.nextLine();
        System.out.print("Cod. Asignatura: ");
        String codigoAsig = lector.nextLine();
        System.out.print("Cod. Prog: ");
        String codigoProg = lector.nextLine();

        System.out.print("Cantidad de estudiantes: ");
        int cantidadEstudiantes = lector.nextInt();

        Estudiante[] estudiante = new Estudiante[cantidadEstudiantes];

        for (int i = 0; i < cantidadEstudiantes; i++) {
            System.out.println("Datos del estudiante #" + (i + 1));
            System.out.print("Número de carnet: ");
            estudiante.carnet = lector.nextLine();
            System.out.print("Nombres y Apellidos: ");
            estudiante.nombre = lector.nextLine();

            Estudiante estudiante = new Estudiante(nombre, carnet);

            do {
                try {
                    System.out.print("Primer parcial (máximo 35.00): ");
                    estudiante.PriParcial = Double.parseDouble(lector.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error: Ingrese un valor numérico válido.");
                }
            } while (estudiante.PriParcial < 0.00 || estudiante.PriParcial > 35.00);

            System.out.print("¿La asignatura lleva proyecto de curso? (Si/No): ");
            char proyectoCurso = lector.next().charAt(0);

            if (proyectoCurso == 'S' || proyectoCurso == 's') {

                do {
                    try {
                        System.out.print("Nota de Proyecto (máximo 35.00): ");
                        estudiante.Proyec = Double.parseDouble(lector.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese un valor numérico válido.");
                    }

                } while (estudiante.Proyec < 0.00 || estudiante.Proyec > 35.00);

                do {
                    try {
                        System.out.print("Sistemáticos (máximo 30.00): ");
                        estudiante.Sist = Double.parseDouble(lector.nextLine());

                    } catch (NumberFormatException e) {
                        System.out.println("Error: Ingresar un valor valido.");
                    }
                } while (estudiante.Sist < 0.00 || estudiante.Sist > 30.00);

                estudiante.NF = estudiante.PriParcial + estudiante.Sist + estudiante.Proyec;

            } else {

                do {
                    try {
                        System.out.print("Segundo parcial (máximo 35.00): ");
                        estudiante.SeParcial = Double.parseDouble(lector.nextLine());

                    } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese un valor numérico válido.");
                    }
                } while (estudiante.SeParcial < 0.00 || estudiante.SeParcial > 35.00);

                do {
                    try {
                        System.out.print("Sistemáticos (máximo 30.00): ");
                        estudiante.Sist = Double.parseDouble(lector.nextLine());

                    } catch (NumberFormatException e) {
                        System.out.println("Error: Ingrese un valor numérico válido.");
                    }
                } while (estudiante.Sist < 0.00 || estudiante.Sist > 30.00);

                estudiante.NF = estudiante.PriParcial + estudiante.Sist + estudiante.SeParcial;

            } // if 1

            try {
                if (estudiante.NF < 60.00) {
                    System.out.print("Examen de primera convocatoria (máximo 70.00): ");
                    estudiante.examenConvo1 = Double.parseDouble(lector.nextLine());
                    estudiante.NFC1 = estudiante.Sist + estudiante.examenConvo1;

                    if (estudiante.NFC1 < 60.00) {
                        System.out.print("Examen de segunda convocatoria (máximo 100.00): ");
                        estudiante.examenConvo2 = Double.parseDouble(lector.nextLine());
                        estudiante.NFC2 = estudiante.examenConvo2;
                    }
                }

                estudiante.Apro = estudiante.NF >= 60.00 || estudiante.NFC1 >= 60.00 || estudiante.NFC2 >= 60;

                do {
                    System.out.print("¿Desertó el curso? (S/N): ");
                    char desercion = lector.next().charAt(0);

                } while ((desercion != 's' || desercion != 'S') || (desercion != 'N' || desercion != 'n'));

            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un valor numérico válido.");
            }
            lector.close();
        } // for

    } // obtenerDatos

    public static void mostrarActa(Estudiante[] estudiantes) {
        System.out.println(
                "Nº Carnet\tNombres y Apellidos\t1er Parcial\t2do Parcial\tSistematicos\tProyecto\tNota Final\tConvo I\tNota Final Convo I\tConvo II\tNota Final Convo II\tAprobado\tDeserción");
        for (Estudiante estudiante : estudiantes) {
            System.out
                    .println(estudiante.carnet + " \t\t" + estudiante.nombre + "\t\t\t" + estudiante.PriParcial + "\t\t"
                            + estudiante.SeParcial + "\t\t" + estudiante.Sist + "\t\t" + estudiante.Proyec + "\t\t"
                            + estudiante.NF
                            + "\t\t" + estudiante.examenConvo1 + "\t\t" + estudiante.NFC1 + "\t\t"
                            + estudiante.examenConvo2 + "\t\t" + estudiante.NFC2 + "\t\t"
                            + (estudiante.Apro ? "Si" : "No") + "\t\t" + (estudiante.Desercion ? "Si" : "No"));
        }
    } // mostrar acta

    public static void mostrarEst(Estudiante[] estudiantes) {
        int matriculaInicial = estudiantes.length;
        int matriculaEfectiva = 0;
        int numDeserciones = 0;
        int numAprobados = 0;
        int numReprobados = 0;
        double sumaNotas = 0;
        double notaMinima = Double.MAX_VALUE;
        double notaMaxima = Double.MIN_VALUE;

        for (Estudiante estudiante : estudiantes) {
            if (!estudiante.Desercion) {
                matriculaEfectiva++;
                sumaNotas += estudiante.NF;

                if (estudiante.NF < notaMinima) {
                    notaMinima = estudiante.NF;
                }

                if (estudiante.NF > notaMaxima) {
                    notaMaxima = estudiante.NF;
                }

                if (estudiante.Apro) {
                    numAprobados++;
                } else {
                    numReprobados++;
                }
            } else {
                numReprobados++;

            }
        }

        double porcentajeAprobados = (double) numAprobados / matriculaEfectiva * 100;
        double porcentajeReprobados = (double) numReprobados / matriculaEfectiva * 100;
        double promedioNotas = matriculaEfectiva > 0 ? sumaNotas / matriculaEfectiva : 0;

        System.out.println("Reporte de Datos Estadísticos del Curso:");
        System.out.println("Matrícula Inicial: " + matriculaInicial);
        System.out.println("Matrícula Efectiva: " + matriculaEfectiva);
        System.out.println("Número de Deserciones: " + numDeserciones);
        System.out.println("Cantidad de Aprobados: " + numAprobados);
        System.out.println("% de Aprobados: " + porcentajeAprobados + "%");
        System.out.println("Cantidad de Reprobados: " + numReprobados);
        System.out.println("% de Reprobados: " + porcentajeReprobados + "%");
        System.out.println("Nota Mínima: " + (matriculaEfectiva > 0 ? notaMinima : "N/A"));
        System.out.println("Nota Máxima: " + (matriculaEfectiva > 0 ? notaMaxima : "N/A"));
        System.out.println("Promedio de Notas: " + promedioNotas);
    }

}
// class App
