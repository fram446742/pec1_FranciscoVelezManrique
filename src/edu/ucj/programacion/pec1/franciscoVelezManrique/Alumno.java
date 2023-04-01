package edu.ucj.programacion.pec1.franciscoVelezManrique;

public class Alumno {
    // Declaramos las variables que se utilizarán en la clase.
    private String nombre;
    private String apellido;
    private String dni;

    // Es un constructor.
    public Alumno(String nombre, String apellido, String dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
    }

    /**
     * > Esta función devuelve el valor de la variable `nombre`
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
     * Esta función devuelve el valor de la variable apellido.
     *
     * @return El valor de la variable apellido.
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * > Esta función establece el valor de la variable apellido al valor del
     * parámetro apellido
     *
     * @param apellido El apellido de la persona.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Esta función devuelve el valor del atributo dni del objeto que lo llama.
     *
     * @return El atributo dni del objeto.
     */
    public String getDni() {
        return this.dni;
    }

    /**
     * Esta función establece el valor del atributo dni al valor del parámetro de
     * cadena.
     *
     * @param string La cadena a configurar como DNI.
     */
    public void setDni(String string) {
        this.dni = string;
    }

}