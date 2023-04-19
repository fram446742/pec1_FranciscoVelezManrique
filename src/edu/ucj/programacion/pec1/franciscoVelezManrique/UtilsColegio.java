package edu.ucj.programacion.pec1.franciscoVelezManrique;

import java.util.Scanner;

public class UtilsColegio {

    @SuppressWarnings("resource")
    /**
     * Le pide al usuario un valor de cierto tipo y lo devuelve
     *
     * @param message  El mensaje que se mostrará al usuario.
     * @param dataType el tipo de datos que desea obtener del usuario.
     * @return El resultado de la instrucción switch.
     */
    public static Object pideDatos(String message, String dataType) {
        System.out.println(message);
        Scanner sc = new Scanner(System.in);
        Object result = null;
        switch (dataType) {
            case "int":
                while (!sc.hasNextInt()) {
                    System.out.println("Introduzca un dato de tipo Int!");
                    sc.nextLine();
                }
                result = sc.nextInt();
                break;
            case "double":
                while (!sc.hasNextDouble()) {
                    System.out.println("Introduzca un dato de Double Int!");
                    sc.nextLine();
                }
                result = sc.nextDouble();
                break;
            case "string":
                result = sc.nextLine();
                break;
            default:
                System.out.println("Tipo de dato no válido!");
        }
        return result;
    }

    /**
     * Crea una matriz de objetos Alumno, luego pide al usuario el nombre, apellido
     * y DNI de cada
     * objeto Alumno, y luego devuelve la matriz
     *
     * @param numAlumnos El número de alumnos a crear.
     * @return Una matriz de objetos del alumno.
     */
    public static Alumno[] crearAlumnos(int numAlumnos) {
        Alumno[] alumnos = new Alumno[numAlumnos];

        for (int i = 0; i < alumnos.length; i++) {
            String nombre = (String) pideDatos("Introduce el nombre del alumno: ", "string");
            String apellido = (String) pideDatos("Introduce el apellido del alumno: ", "string");
            String dni = (String) pideDatos("Introduce el DNI del alumno: ", "string");
            alumnos[i] = new Alumno(nombre, apellido, dni);

        }

        return alumnos;
    }

    /**
     * La función toma una matriz de estudiantes y una escuela como parámetros. Si
     * la matriz de alumnos
     * no está vacía y la escuela tiene aulas, la función asigna a cada alumno una
     * aula. Si no hay
     * lugar para un estudiante, la función imprime un mensaje
     *
     * @param alumno  una serie de estudiantes
     * @param colegio El objeto escolar.
     */
    public static void asignarAlumno(Alumno[] alumno, Colegio colegio) {
        if (alumno.length != 0 && colegio.getAulas().length != 0) {

            for (int i = 0; i < alumno.length; i++) {

                boolean asignado = false;

                for (int j = 0; j < colegio.getAulas().length && !asignado; j++) {
                    Aula aula = colegio.getAulas()[j];

                    if (aula != null) {
                        if (aula.asientoLibre()) {

                            for (int k = 0; k < aula.getAsientos().length; k++) {
                                if (aula.getAsiento(k) == null) {

                                    aula.setAsiento(k, alumno[i]);

                                    asignado = true;

                                    System.out.println(
                                            "El alumno " + alumno[i].getNombre() + " con DNI: " + alumno[i].getDni()
                                                    + " se asigna en el aula " + aula.getNumero()
                                                    + " en el asiento " + (k + 1));
                                    break;
                                }
                            }
                        }
                    }
                }
                if (!asignado) {
                    System.out.println(
                            "No hay sitio para el alumno " + alumno[i].getNombre() + " con DNI: "
                                    + alumno[i].getDni());
                }
            }
        } else {
            System.out.println("No hay sitio en ningún aula");
        }
    }

}