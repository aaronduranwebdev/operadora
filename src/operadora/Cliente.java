package operadora;

import utils.Nacionalidades;
import utils.Provincias;

/**
 * Clase Cliente que almacena la información relacionada con un cliente
 *
 * @author Aarón Durán
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
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

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public Provincias getProvincia() {
        return provincia;
    }

    public Nacionalidades getNacionalidad() {
        return nacionalidad;
    }

    @Override
    public String toString() {
        return "- Cliente -\n"
                + "Nombre:    " + nombre + "\n"
                + "Apellido 1:    " + apellido1 + "\n"
                + "Apellido 2:    " + apellido2 + "\n"
                + "Domicilio:    " + domicilio + "\n"
                + "Nacionalidad:    " + nacionalidad;
    }

}
