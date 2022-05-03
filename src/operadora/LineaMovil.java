package operadora;

/**
 *
 * @author a21aarondn
 */
public class LineaMovil {

    private int id;
    private int contrato;
    private String numTelefono;
    private double precio;

    public LineaMovil(int id, int contrato, String numTelefono, double precio) {
        this.id = id;
        this.contrato = contrato;
        this.numTelefono = numTelefono;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public int getContrato() {
        return contrato;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public double getPrecio() {
        return precio;
    }

}
