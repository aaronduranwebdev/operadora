package operadora;

/**
 * Clase que almacena la información sobre una línea móvil
 *
 * @author Aarón Durán
 *
 */
public class LineaMovil {

    private int contrato;
    private String numTelefono;
    private double precio;

    /**
     * Constructor de la clase LineaMovil
     *
     * @param contrato Identificador del contrato
     * @param numTelefono Número de teléfono de la línea móvil
     * @param precio Precio de la línea
     */
    public LineaMovil(int contrato, String numTelefono, double precio) {
        this.contrato = contrato;
        this.numTelefono = numTelefono;
        this.precio = precio;
    }

    /**
     * Getter del atributo contrato
     *
     * @return Identificador del contrato asociado a la línea
     */
    public int getContrato() {
        return contrato;
    }

    /**
     * Getter del atributo numTelefono
     *
     * @return Número de teléfono de la línea móvil
     */
    public String getNumTelefono() {
        return numTelefono;
    }

    /**
     * Getter del atributo precio
     *
     * @return Precio de la línea móvil
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método que sobrescribe el método toString()
     *
     * @return Cadena de texto con la información
     */
    @Override
    public String toString() {
        return "LineaMovil{" + "contrato=" + contrato + ", numTelefono=" + numTelefono + ", precio=" + precio + '}';
    }

}
