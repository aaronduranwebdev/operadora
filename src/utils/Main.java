package utils;

import bd.BDLeer;
import java.sql.SQLException;
import java.util.ArrayList;
import operadora.Cliente;

/**
 * @author a21aarondn
 */
public class Main {

    public static void main(String[] args) throws SQLException {
        try {
            System.out.println(BDLeer.leerCliente(""));
            System.out.println(BDLeer.buscarCliente("Mario"));
            ArrayList<Cliente> array = BDLeer.listaClientes();
            for (Cliente cliente : array) {
                System.out.println(cliente.toString());
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
