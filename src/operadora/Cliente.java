package operadora;

import utils.Nacionalidades;

/**
 *
 * @author a21aarondn
 */
public class Cliente {

    private int id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String dni;
    private String domicilio;
    private String localidad;
    private String provincia;
    private Nacionalidades nacionalidad;

    public Cliente(int id, String nombre, String apellido1, String apellido2, String dni, String domicilio, String localidad, String provincia, Nacionalidades nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.dni = dni;
        this.domicilio = domicilio;
        this.localidad = localidad;
        this.provincia = provincia;
        this.nacionalidad = nacionalidad;
    }

    public int getId() {
        return id;
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

    public String getDni() {
        return dni;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getProvincia() {
        return provincia;
    }

    public Nacionalidades getNacionalidad() {
        return nacionalidad;
    }

    

    @Override
    public String toString() {
        return "- Cliente -\n"
                + "ID:    " + id + "\n"
                + "Nombre:    " + nombre + "\n"
                + "Apellido 1:    " + apellido1 + "\n"
                + "Apellido 2:    " + apellido2 + "\n"
                + "Domicilio:    " + domicilio + "\n"
                + "Nacionalidad:    " + nacionalidad;
    }

}
