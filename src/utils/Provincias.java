package utils;

/**
 * Enumeración de provincias
 *
 * @author Aarón Durán
 *
 */
public enum Provincias {
    PO("Pontevedra"), LU("Lugo"), CO("A Coruña"), OU("Ourense");
    private String provincia;

    private Provincias(String provincia) {
        this.provincia = provincia;
    }

    public String getProvincia() {
        return provincia;
    }

}
