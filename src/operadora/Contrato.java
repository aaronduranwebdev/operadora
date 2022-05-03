package operadora;

/**
 *
 * @author a21aarondn
 */
public class Contrato {

    private int id;
    private int cliente;
    private String iban;
    private boolean fijo;
    private double precioFijo;
    private boolean internet;
    private boolean precioInternet;
    private boolean movil;

    public Contrato(int id, int cliente, String iban, boolean fijo, double precioFijo, boolean internet, boolean precioInternet, boolean movil) {
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

    public int getCliente() {
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

    public boolean isPrecioInternet() {
        return precioInternet;
    }

    public boolean isMovil() {
        return movil;
    }

}
