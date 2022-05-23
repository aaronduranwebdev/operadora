package utils;

import bd.BDInsertar;
import bd.BDLeer;
import java.sql.SQLException;
import operadora.Cliente;
import operadora.Contrato;
import operadora.LineaMovil;

/**
 * @author a21aarondn
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        try {

            Cliente prueba = new Cliente("34824956N", "A", "B", "C", "D", "E", Provincias.PO, Nacionalidades.EN);
            String[] nuevocliente = BDInsertar.insertarCliente(prueba);
            System.out.println(nuevocliente[0]);
            System.out.println(nuevocliente[1]);
            /* Contrato tmp = new Contrato(0, nuevocliente[1], "1234456547", true, 10.99, true, 10.50, false);
            /*String[] nuevocontrato = BDInsertar.insertarContrato(tmp);
            System.out.println(nuevocontrato[0]);
            System.out.println(nuevocontrato[1]);*/
            //LineaMovil movil = new LineaMovil(51, "612987258", 5.99);
            /*String[] nuevalinea = BDInsertar.insertarLineaMovil(movil);
            System.out.println(nuevalinea[0]);
            System.out.println(nuevalinea[1]);
            System.out.println(BDLeer.leerCliente("34824956N"));*/
            //System.out.println(BDInsertar.insertarLi+neaMovil(movil)[1]);
        } catch (SQLException e) {
            System.err.println(e.getMessage());
            System.err.println(e.getSQLState());
        }
    }

}
