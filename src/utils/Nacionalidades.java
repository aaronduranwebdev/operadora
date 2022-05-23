package utils;

/**
 * Enumeración de nacionalidades
 *
 * @author Aarón Durán
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
 */
public enum Nacionalidades {
    ES("Española"), EN("Inglesa"), PT("Portuguesa");

    private String nacionalidad;

    private Nacionalidades(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

}
