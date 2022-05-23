package bd;

import java.sql.*;
import operadora.Cliente;
import operadora.Contrato;
import operadora.LineaMovil;

/**
 * Métodos de inserción de clientes, contratos y líneas en la base de datos
 *
 * @author Aarón Durán
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
 * @version 2
 */
public class BDInsertar {

    //private static String[] CONFIG_DB = Utilidades.leerConfiguracion();

    /**
     * Método que inserta un nuevo cliente en la base de datos
     *
     * @param nuevoCliente Objeto Cliente con los datos del cliente
     * @return Array de Strings con el resultado de la operación
     * @throws SQLException Excepción SQL si falla la consulta
     */
    public static String[] insertarCliente(Cliente nuevoCliente) throws SQLException {
        Connection cx = BD.obtenerInstancia().conexionBD();
        //Connection cx = DriverManager.getConnection("jdbc:mysql://" + CONFIG_DB[0] + ":" + CONFIG_DB[1] + "/" + CONFIG_DB[2], CONFIG_DB[3], CONFIG_DB[4]);
        PreparedStatement preStmt = cx.prepareStatement("CALL insertarCliente (?,?,?,?,?,?,?,?, @OK, @dniCliente, @mensaje)");
        preStmt.setString(1, nuevoCliente.getDni());
        preStmt.setString(2, nuevoCliente.getNombre());
        preStmt.setString(3, nuevoCliente.getApellido1());
        preStmt.setString(4, nuevoCliente.getApellido2());
        preStmt.setString(5, nuevoCliente.getDomicilio());
        preStmt.setString(6, nuevoCliente.getLocalidad());
        preStmt.setString(7, nuevoCliente.getProvincia().toString());
        preStmt.setString(8, nuevoCliente.getNacionalidad().toString());
        preStmt.executeUpdate();
        String[] resultado = new String[3];
        preStmt = cx.prepareStatement("SELECT @OK");
        ResultSet rs = preStmt.executeQuery();
        if (rs.next()) {
            int ok = Integer.parseInt(rs.getString(1));
            if (ok == 1) {
                resultado[0] = "1";
                preStmt = cx.prepareStatement("SELECT @dniCliente");
                rs = preStmt.executeQuery();
                if (rs.next()) {
                    resultado[1] = rs.getString(1);
                }
            } else {
                resultado[0] = "0";
                resultado[1] = "No se pudo insertar el cliente";

            }

        }
        rs.close();
        preStmt.close();
        cx.close();
        return resultado;
    }

    /**
     * Método que inserta un nuevo contrato en la base de datos
     *
     * @param nuevoContrato Objeto Contrato con los datos del contrato
     * @return Array de Strings con el resultado de la operación
     * @throws SQLException Excepción SQL si falla la consulta
     */
    public static String[] insertarContrato(Contrato nuevoContrato) throws SQLException {
        Connection cx = BD.obtenerInstancia().conexionBD();
        //Connection cx = DriverManager.getConnection("jdbc:mysql://" + CONFIG_DB[0] + ":" + CONFIG_DB[1] + "/" + CONFIG_DB[2], CONFIG_DB[3], CONFIG_DB[4]);
        PreparedStatement preStmt = cx.prepareStatement("CALL insertarContrato(?, ?, ?, ?, ?, ?, ?, @OK, @idContrato, @mensaje)");
        preStmt.setString(1, nuevoContrato.getCliente());
        preStmt.setString(2, nuevoContrato.getIban());
        preStmt.setBoolean(3, nuevoContrato.isFijo());
        preStmt.setDouble(4, nuevoContrato.getPrecioFijo());
        preStmt.setBoolean(5, nuevoContrato.isInternet());
        preStmt.setDouble(6, nuevoContrato.getPrecioInternet());
        preStmt.setBoolean(7, nuevoContrato.isMovil());
        preStmt.executeUpdate();
        String[] resultado = new String[3];
        preStmt = cx.prepareStatement("SELECT @OK");
        ResultSet rs = preStmt.executeQuery();
        if (rs.next()) {
            int ok = Integer.parseInt(rs.getString(1));
            if (ok == 1) {
                resultado[0] = "1";
                preStmt = cx.prepareStatement("SELECT @idContrato");
                rs = preStmt.executeQuery();
                if (rs.next()) {
                    resultado[1] = rs.getString(1);
                }

            } else {
                resultado[0] = "0";
                resultado[1] = "No se pudo insertar el contrato";
            }

        }
        preStmt.close();
        cx.close();
        return resultado;
    }

    /**
     * Método que inserta una nueva línea móvil en la base de datos
     *
     * @param nuevaLineaMovil Objeto LineaMovil con los datos de la línea
     * @return Array de Strings con el resultado de la operación
     * @throws SQLException Excepción SQL si falla la consulta
     */
    public static String[] insertarLineaMovil(LineaMovil nuevaLineaMovil) throws SQLException {
        Connection cx = BD.obtenerInstancia().conexionBD();
        //Connection cx = DriverManager.getConnection("jdbc:mysql://" + CONFIG_DB[0] + ":" + CONFIG_DB[1] + "/" + CONFIG_DB[2], CONFIG_DB[3], CONFIG_DB[4]);
        PreparedStatement preStmt = cx.prepareStatement("CALL insertarLineaMovil(?, ?, ?, @OK, @idLineaMovil, @mensaje)");
        preStmt.setInt(1, nuevaLineaMovil.getContrato());
        preStmt.setString(2, nuevaLineaMovil.getNumTelefono());
        preStmt.setDouble(3, nuevaLineaMovil.getPrecio());
        preStmt.executeUpdate();
        String[] resultado = new String[3];
        preStmt = cx.prepareStatement("SELECT @OK");
        ResultSet rs = preStmt.executeQuery();
        if (rs.next()) {
            int ok = Integer.parseInt(rs.getString(1));
            if (ok == 1) {
                resultado[0] = "1";
                preStmt = cx.prepareStatement("SELECT @idLineaMovil");
                rs = preStmt.executeQuery();
                if (rs.next()) {
                    resultado[1] = rs.getString(1);
                }

            } else {
                resultado[0] = "0";
                resultado[1] = "No se pudo insertar la línea móvil";
            }
        }
        preStmt.close();
        cx.close();
        return resultado;
    }
}
