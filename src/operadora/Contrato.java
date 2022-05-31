package operadora;

/**
 * Clase Contrato que almacena la información sobre un contrato
 *
 * @author Aarón Durán
 *
 */
public class Contrato {

    private int id;
    private String cliente;
    private String iban;
    private boolean fijo;
    private double precioFijo;
    private boolean internet;
    private double precioInternet;
    private boolean movil;

    /**
     * Constructor de la clase Contrato
     *
     * @param id ID del contrato
     * @param cliente DNI del cliente asociado al contrato
     * @param iban IBAN de la cuenta bancaria asociada al contrato
     * @param fijo true/false si incluye teléfono fijo
     * @param precioFijo Precio del teléfono fijo
     * @param internet true/false si incluye Internet
     * @param precioInternet Precio de la conexión a Internet
     * @param movil true/false si incluye líneas móviles
     */
    public Contrato(int id, String cliente, String iban, boolean fijo, double precioFijo, boolean internet, double precioInternet, boolean movil) {
        this.id = id;
        this.cliente = cliente;
        this.iban = iban;
        this.fijo = fijo;
        this.precioFijo = precioFijo;
        this.internet = internet;
        this.precioInternet = precioInternet;
        this.movil = movil;
    }

    /**
     * Getter del atributo id
     *
     * @return Devuelve el ID del contrato
     */
    public int getId() {
        return id;
    }

    /**
     * Getter del atributo cliente
     *
     * @return DNI del cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * Getter del atributo iban
     *
     * @return IBAN de la cuenta bancaria asociada al contrato
     */
    public String getIban() {
        return iban;
    }

    /**
     * Getter del atributo isFijo
     *
     * @return true/false si el contrato tiene un fijo
     */
    public boolean isFijo() {
        return fijo;
    }

    /**
     * Getter del atributo precioFijo
     *
     * @return Precio del fijo
     */
    public double getPrecioFijo() {
        return precioFijo;
    }

    /**
     * Getter del atributo isInternet
     *
     * @return true/false si el contrato tiene Internet
     */
    public boolean isInternet() {
        return internet;
    }

    /**
     * Getter del atributo precioInternet
     *
     * @return Precio de la conexión a Internet
     */
    public double getPrecioInternet() {
        return precioInternet;
    }

    /**
     * Getter del atributo isMovil
     *
     * @return true/false si el contrato tiene líneas móviles
     */
    public boolean isMovil() {
        return movil;
    }

    /**
     * Método que sobrescribe el método toString()
     *
     * @return Cadena de texto con la información
     */
    @Override
    public String toString() {
        return "Contrato{" + "cliente=" + cliente + ", iban=" + iban + ", fijo=" + fijo + ", precioFijo=" + precioFijo + ", internet=" + internet + ", precioInternet=" + precioInternet + ", movil=" + movil + '}';
    }

}
