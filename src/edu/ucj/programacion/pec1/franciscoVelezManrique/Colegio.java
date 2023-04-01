package edu.ucj.programacion.pec1.franciscoVelezManrique;

import static edu.ucj.programacion.pec1.franciscoVelezManrique.UtilsColegio.*;

public class Colegio {

    // Creación de una clase llamada "colegio" con los siguientes atributos:
    // - nombre
    // - direccion
    // - nAulas
    // - aulas
    // - alumnos
    private String nombre;
    private String direccion;
    private int nAulas;
    private Aula[] aulas;
    private Alumno[] alumnos;

    // Es un constructor.
    public Colegio() {

    }

    // Es un constructor.
    public Colegio(String nombre, String direccion, int nAulas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nAulas = nAulas;
        this.aulas = new Aula[nAulas];
        this.aulas = crearAulas(nAulas);
    }

    // Es un constructor.
    public Colegio(String nombre, String direccion, int nAulas, int numAlumnos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nAulas = nAulas;
        this.aulas = crearAulas(this.nAulas);
        this.alumnos = crearAlumnos(numAlumnos);
    }

    /**
     * Crea una matriz de objetos de Aula, cada uno de los cuales se inicializa con
     * un número y un piso
     *
     * @param numAulas El número de aulas a crear.
     * @return Una matriz de objetos de Aula.
     */
    public Aula[] crearAulas(int numAulas) {
        Aula[] aulas = new Aula[numAulas];
        int contador = 1; // Variable para asignar el número del aula
        int aulasPorPlanta = (int) pideDatos("Cantidad de plantas: ", "int"); // Variable para indicar el número de
                                                                              // aulas por planta

        for (int i = 0; i < aulas.length; i++) {
            double numero = contador;
            int planta = (int) Math.ceil(numero / aulasPorPlanta) - 1;
            Aula aula = new Aula(numero, planta);
            aulas[i] = aula;
            contador++;
        }

        return aulas;
    }

    /**
     * > Esta función devuelve el valor de la variable nombre
     *
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * > Esta función establece el valor de la variable nombre al valor del
     * parámetro nombre
     *
     * @param nombre El nombre del parámetro.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * > Esta función devuelve el valor de la variable `direccion`
     *
     * @return La dirección del objeto.
     */
    public String getDireccion() {
        return this.direccion;
    }

    /**
     * > Esta función establece el valor de la variable direccion al valor del
     * parámetro direccion
     *
     * @param direccion La dirección de la ubicación que desea buscar.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * Esta función devuelve el valor de la variable privada aulas.
     *
     * @return La matriz de aulas.
     */
    public Aula[] getAulas() {
        return this.aulas;
    }

}