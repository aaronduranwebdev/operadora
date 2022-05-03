package bd;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import operadora.Cliente;
import utils.Nacionalidades;

/**
 * Métodos lectura de clientes, contratos y líneas desde la base de datos
 *
 * @author Aarón Durán
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
 */
public class BDLeer {

    private static PreparedStatement preStmt;
    private static ResultSet rs;
    private static BD bd = new BD("jdbc:mysql://localhost:3307/operadora", "root", "root");

    /**
     *
     * @param busqueda
     * @return
     * @throws SQLException
     */
    public static int buscarCliente(String busqueda) throws SQLException {
        int id = 0;
        preStmt = bd.conexion.prepareStatement("SELECT id FROM t_clientes WHERE MATCH (nombre) AGAINST ('" + busqueda + "*' IN BOOLEAN MODE)");

        rs = preStmt.executeQuery();
        if (rs.next()) {
            id = rs.getInt(1);
        }
        return id;
    }

    public static ArrayList<Cliente> buscarClientes(String busqueda) throws SQLException {
        int id = 0;
        preStmt = bd.conexion.prepareStatement("SELECT id FROM t_clientes WHERE MATCH (nombre) AGAINST ('" + busqueda + "*' IN BOOLEAN MODE)");

        rs = preStmt.executeQuery();

        ArrayList<Cliente> lista = new ArrayList<>();
        while (rs.next()) {
            lista.add(new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), Nacionalidades.valueOf(rs.getString(9))));
        }
        return lista;
    }

    public static Cliente leerCliente(String dni) throws SQLException {
        Cliente cliente = null;

        preStmt = bd.conexion.prepareStatement("SELECT * FROM t_clientes WHERE dni = '" + dni + "'");
        rs = preStmt.executeQuery();

        if (rs.next()) {
            cliente = new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), Nacionalidades.valueOf(rs.getString(9)));

        }

        return cliente;
    }

    /**
     * Método que devuelve el listado completo de clientes
     *
     * @return ArrayList de objetos {@link Cliente}
     * @throws SQLException Excepción SQL si falla la consulta
     */
    public static ArrayList<Cliente> listaClientes() throws SQLException {
        try {
            preStmt = bd.conexion.prepareStatement("SELECT * FROM t_clientes");

            rs = preStmt.executeQuery();

            /*ResultSetMetaData rsmd = rs.getMetaData();
            int numColumnas = rsmd.getColumnCount();*/
            ArrayList<Cliente> lista = new ArrayList<>();
            while (rs.next()) {
                lista.add(new Cliente(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getString(8), Nacionalidades.valueOf(rs.getString(9))));
            }
            return lista;
        } catch (SQLException e) {
            System.out.println(e.getSQLState());
            return null;
        } finally {
            rs.close();
            preStmt.close();

        }
    }
}
