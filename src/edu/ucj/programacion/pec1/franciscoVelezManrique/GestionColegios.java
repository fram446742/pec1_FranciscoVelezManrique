package edu.ucj.programacion.pec1.franciscoVelezManrique;

import static edu.ucj.programacion.pec1.franciscoVelezManrique.UtilsColegio.*;

public class GestionColegios {
    public static void main(String[] args) {
        // Declaración de variables
        String nombre;
        String direccion;
        int numeroAulas;
        int numeroAlumnos;

        // Obtenemos los argumentos desde la línea de comando.
        nombre = args[0];
        direccion = args[1];
        numeroAulas = Integer.parseInt(args[2]);
        numeroAlumnos = Integer.parseInt(args[3]);

        // Creamos un nuevo objeto de la clase Colegio.
        Colegio colegio = new Colegio(nombre, direccion, numeroAulas);

        // Creamos una matriz de objetos de alumno.
        Alumno[] alumnos = crearAlumnos(numeroAlumnos);

        gestion(alumnos, colegio);
    }

    public static void gestion(Alumno[] alumnos, Colegio colegio) {

        // Asignamoslos alumnos a la escuela.
        asignarAlumno(alumnos, colegio);

    }
}

// https://github.com/fram446742/pec1_FranciscoVelezManrique