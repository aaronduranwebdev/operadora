package operadora;

/**
 *
 * @author Aarón Durán
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
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

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public String getIban() {
        return iban;
    }

    public boolean isFijo() {
        return fijo;
    }

    public double getPrecioFijo() {
        return precioFijo;
    }

    public boolean isInternet() {
        return internet;
    }

    public double getPrecioInternet() {
        return precioInternet;
    }

    public boolean isMovil() {
        return movil;
    }

    @Override
    public String toString() {
        return "Contrato{" + "cliente=" + cliente + ", iban=" + iban + ", fijo=" + fijo + ", precioFijo=" + precioFijo + ", internet=" + internet + ", precioInternet=" + precioInternet + ", movil=" + movil + '}';
    }

}
