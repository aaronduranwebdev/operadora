package bd;

import java.sql.*;
import java.util.ArrayList;
import operadora.Cliente;
import operadora.Contrato;
import operadora.LineaMovil;
import utils.Nacionalidades;
import utils.Provincias;

/**
 * Métodos para lectura de clientes, contratos y líneas desde la base de datos
 *
 * @author Aarón Durán
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
 */
public class BDLeer {

    //private static String[] CONFIG_DB = Utilidades.leerConfiguracion();

    /**
     * Método que busca clientes por nombre/apellidos
     *
     * @param busqueda Cadena a buscar
     * @return Array de clientes
     * @throws SQLException Excepción SQL si falla la consulta
     */
    public static ArrayList<Cliente> buscarClientes(String busqueda) throws SQLException {
        Connection cx = BD.obtenerInstancia().conexionBD();
        //Connection cx = DriverManager.getConnection("jdbc:mysql://" + CONFIG_DB[0] + ":" + CONFIG_DB[1] + "/" + CONFIG_DB[2], CONFIG_DB[3], CONFIG_DB[4]);
        PreparedStatement preStmt = cx.prepareStatement("SELECT * FROM t_clientes WHERE MATCH (nombre, apellido1, apellido2) AGAINST (? IN BOOLEAN MODE)");
        preStmt.setString(1, busqueda); // AL PRIMER INTERROGANTE LE ASIGNA LA VARIABLE BUSQUEDA
        ResultSet rs = preStmt.executeQuery(); // CREAR UN OBJETO RESULTSET
        ArrayList<Cliente> lista = new ArrayList<>();
        while (rs.next()) {
            lista.add(new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), Provincias.valueOf(rs.getString(7)), Nacionalidades.valueOf(rs.getString(8))));
        }
        rs.close();
        preStmt.close();
        cx.close();
        return lista;
    }

    public static Cliente leerCliente(String dni) throws SQLException {
        Cliente cliente = null;
        Connection cx = BD.obtenerInstancia().conexionBD();
        //Connection cx = DriverManager.getConnection("jdbc:mysql://" + CONFIG_DB[0] + ":" + CONFIG_DB[1] + "/" + CONFIG_DB[2], CONFIG_DB[3], CONFIG_DB[4]);
        PreparedStatement preStmt = cx.prepareStatement("SELECT * FROM t_clientes WHERE dni = ?");
        preStmt.setString(1, dni);
        ResultSet rs = preStmt.executeQuery();
        if (rs.next()) {
            cliente = new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), Provincias.valueOf(rs.getString(7)), Nacionalidades.valueOf(rs.getString(8)));
        }
        rs.close();
        preStmt.close();
        cx.close();
        return cliente;
    }
    /*public static String buscarPorTelefono(String telefono) throws SQLException {
        Connection cx = BD.obtenerInstancia().conexionBD();
        PreparedStatement preStmt = cx.prepareStatement("SELECT * FROM t_clientes WHERE")
    }*/
    /**
     * Método que devuelve el listado completo de clientes
     *
     * @return ArrayList de objetos {@link Cliente}
     * @throws SQLException Excepción SQL si falla la consulta
     */
    public static ArrayList<Cliente> listaClientes() throws SQLException {
        Connection cx = BD.obtenerInstancia().conexionBD();
        //Connection cx = DriverManager.getConnection("jdbc:mysql://" + CONFIG_DB[0] + ":" + CONFIG_DB[1] + "/" + CONFIG_DB[2], CONFIG_DB[3], CONFIG_DB[4]);
        PreparedStatement preStmt = cx.prepareStatement("SELECT * FROM t_clientes");
        ResultSet rs = preStmt.executeQuery();
        ArrayList<Cliente> clientes = new ArrayList<>();
        while (rs.next()) {
            rs.getRow();
            clientes.add(new Cliente(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), Provincias.valueOf(rs.getString(7)), Nacionalidades.valueOf(rs.getString(8))));
        }
        rs.close();
        preStmt.close();
        cx.close();
        return clientes;
    }

    public static ArrayList<Contrato> listaContratos(String dni) throws SQLException {
        Connection cx = BD.obtenerInstancia().conexionBD();
        //Connection cx = DriverManager.getConnection("jdbc:mysql://" + CONFIG_DB[0] + ":" + CONFIG_DB[1] + "/" + CONFIG_DB[2], CONFIG_DB[3], CONFIG_DB[4]);
        PreparedStatement preStmt = cx.prepareStatement("SELECT * FROM t_contratos WHERE cliente = ?");
        preStmt.setString(1, dni);
        ResultSet rs = preStmt.executeQuery();
        ArrayList<Contrato> contratos = new ArrayList<>();
        while (rs.next()) {
            contratos.add(new Contrato(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getBoolean(4), rs.getDouble(5), rs.getBoolean(6), rs.getDouble(7), rs.getBoolean(8)));
        }
        rs.close();
        preStmt.close();
        cx.close();
        return contratos;

    }

    public static ArrayList<LineaMovil> listaLineaMoviles(int contrato) throws SQLException {
        Connection cx = BD.obtenerInstancia().conexionBD();
        //Connection cx = DriverManager.getConnection("jdbc:mysql://" + CONFIG_DB[0] + ":" + CONFIG_DB[1] + "/" + CONFIG_DB[2], CONFIG_DB[3], CONFIG_DB[4]);
        PreparedStatement preStmt = cx.prepareStatement("SELECT * FROM t_lineasmoviles WHERE contrato = ?");
        preStmt.setInt(1, contrato);
        ResultSet rs = preStmt.executeQuery();
        ArrayList<LineaMovil> lineasMoviles = new ArrayList<>();
        while (rs.next()) {
            lineasMoviles.add(new LineaMovil(rs.getInt(2), rs.getString(3), rs.getDouble(4)));
        }
        rs.close();
        preStmt.close();
        cx.close();
        return lineasMoviles;
    }
}
