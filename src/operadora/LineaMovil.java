package operadora;

/**
 *
 * @author Aarón Durán
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
 */
public class LineaMovil {

    private int contrato;
    private String numTelefono;
    private double precio;

    public LineaMovil(int contrato, String numTelefono, double precio) {
        this.contrato = contrato;
        this.numTelefono = numTelefono;
        this.precio = precio;
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

    @Override
    public String toString() {
        return "LineaMovil{" + "contrato=" + contrato + ", numTelefono=" + numTelefono + ", precio=" + precio + '}';
    }

}
