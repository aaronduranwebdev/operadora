package excepciones;

/**
 * Excepción propia generada cuando el DNI no es correcto
 *
 * @author Aarón Durán
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
 */
public class DNIIncorrectoExcepcion extends Exception {

    /**
     * Atributo que almacena el código numérico del error
     */
    private int tipoError;

    /**
     * Constructor de la excepción
     *
     * @param tipoError Tipo de error personalizado
     */
    public DNIIncorrectoExcepcion(int tipoError) {
        super();
        this.tipoError = tipoError;
    }

    /**
     * Sobreescritura del método getMessage
     *
     * @return Mensaje de error
     */
    @Override
    public String getMessage() {
        String mensaje = "";
        switch (this.tipoError) {
            case 1:
                mensaje = "DNI no válido";
                break;
            case 2:
                mensaje = "Formato de DNI no válido";
                break;
        }
        return mensaje;
    }

}
