package operadora;

import utils.Nacionalidades;
import utils.Provincias;

/**
 * Clase Cliente que almacena la información relacionada con un cliente
 *
 * @author Aarón Durán
 *
 */
public class Cliente {

    private String dni;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String domicilio;
    private String localidad;
    private Provincias provincia;
    private Nacionalidades nacionalidad;

    /**
     * Constructor de la clase Cliente
     *
     * @param dni DNI del cliente
     * @param nombre Nombre del cliente
     * @param apellido1 Primer apellido del cliente
     * @param apellido2 Segundo apellido del cliente
     * @param domicilio Domicilio del cliente
     * @param localidad Localidad del cliente
     * @param provincia Provincia del cliente
     * @param nacionalidad Nacionalidad del cliente
     */
    public Cliente(String dni, String nombre, String apellido1, String apellido2, String domicilio, String localidad, Provincias provincia, Nacionalidades nacionalidad) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.provincia = provincia;
        this.nacionalidad = nacionalidad;
    }

    /**
     * Getter del atributo dni
     *
     * @return DNI del cliente
     */
    public String getDni() {
        return dni;
    }

    /**
     * Getter del atributo nombre
     *
     * @return Nombre del cliente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Getter del atributo apellido1
     *
     * @return Primer apellido del cliente
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Getter del atributo apellido2
     *
     * @return Segundo apellido del cliente
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Getter del atributo domicilio
     *
     * @return Domicilio del cliente
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * Getter del atributo localidad
     *
     * @return Localidad del cliente
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * Getter del atributo provincia
     *
     * @return Provincia del cliente
     */
    public Provincias getProvincia() {
        return provincia;
    }

    /**
     * Getter del atributo nacionalidad
     *
     * @return Nacionalidad del cliente
     */
    public Nacionalidades getNacionalidad() {
        return nacionalidad;
    }

    /**
     * Método que sobrescribe el método toString()
     *
     * @return Cadena de texto con la información
     */
    @Override
    public String toString() {
        return "- Cliente -\n"
                + "Nombre: " + nombre + "\n"
                + "Apellido 1: " + apellido1 + "\n"
                + "Apellido 2: " + apellido2 + "\n"
                + "Domicilio: " + domicilio + "\n"
                + "Nacionalidad: " + nacionalidad;
    }

}
