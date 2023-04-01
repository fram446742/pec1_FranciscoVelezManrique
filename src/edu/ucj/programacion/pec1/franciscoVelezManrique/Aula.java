package edu.ucj.programacion.pec1.franciscoVelezManrique;

public class Aula extends Colegio {
    // Declaramos las variables que se utilizarán en la clase.
    private double numero;
    private int planta;
    private Alumno[] asientos = new Alumno[3];

    // Es un constructor.
    public Aula(double numero, int planta, Alumno[] asientos) {
        super();
        this.numero = numero;
        this.planta = planta;
        this.asientos = asientos;
    }

    // Es un constructor.
    public Aula(double numero, int planta) {
        this.numero = numero;
        this.planta = planta;
    }

    /**
     * > Esta función devuelve el valor de la variable `numero`
     *
     * @return El valor de la variable numero.
     */
    public double getNumero() {
        return this.numero;
    }

    /**
     * Establece el valor de la variable número al valor del parámetro número.
     *
     * @param numero El número a formatear.
     */
    public void setNumero(double numero) {
        this.numero = numero;
    }

    /**
     * > Esta función devuelve el valor de la variable `planta`
     *
     * @return El valor de la variable planta.
     */
    public int getPlanta() {
        return this.planta;
    }

    /**
     * Esta función establece el valor de la variable planta al valor del parámetro
     * planta.
     *
     * @param planta El piso del edificio donde se encuentra la habitación.
     */
    public void setPlanta(int planta) {
        this.planta = planta;
    }

    /**
     * > Esta función devuelve la matriz de estudiantes en el aula.
     *
     * @return La matriz de estudiantes.
     */
    public Alumno[] getAsientos() {
        return this.asientos;
    }

    /**
     * Si el índice es válido, devuelve el elemento en ese índice; de lo contrario,
     * devuelve null.
     *
     * @param i el índice del elemento a devolver
     * @return El objeto en el índice especificado.
     */
    public Alumno getAsiento(int i) {
        if (i >= 0 && i < this.asientos.length) {
            return this.asientos[i];
        } else {
            return null;
        }
    }

    /**
     * Esta función ajusta el valor de la variable asientos al valor del parámetro
     * asientos
     *
     * @param asientos Esta es una matriz de objetos del alumno.
     */
    public void setAsientos(Alumno[] asientos) {
        this.asientos = asientos;
    }

    /**
     * > Esta función establece el valor de la matriz `asientos` en el índice `i` al
     * valor del parámetro
     * `alumno`
     *
     * @param i      El índice del asiento a asignar.
     * @param alumno El estudiante que se agregará al autobús.
     */
    public void setAsiento(int i, Alumno alumno) {
        this.asientos[i] = alumno;
    }

    /**
     * Devuelve verdadero si hay al menos un asiento vacío.
     *
     * @return Un valor booleano.
     */
    public boolean asientoLibre() {
        for (int i = 0; i < this.asientos.length; i++) {
            if (this.asientos[i] == null) {
                return true;
            }
        }
        return false;
    }

    /**
     * > Esta función asigna un alumno al primer asiento disponible en el aula
     *
     * @param alumno El estudiante a ser asignado al asiento.
     */
    public static void asignarAlumno(Alumno[] alumno, Colegio colegio) {
        if (alumno.length != 0 && colegio.getAulas().length != 0) {
            for (int i = 0; i < colegio.getAulas().length; i++) {
                Aula aula = (Aula) colegio.getAulas()[i];
                if (aula.asientoLibre()) {
                    for (int j = 0; j < alumno.length; j++) {
                        if (aula.getAsiento(j) == null) {
                            aula.setAsiento(j, alumno[j]);
                            System.out.println("El alumno " + alumno[j].getNombre() + " " + alumno[j].getApellido()
                                    + " ha sido asignado al aula " + aula.getNumero() + " en el asiento " + (j + 1));
                            break;
                        }
                    }
                }
            }
        }
    }

}