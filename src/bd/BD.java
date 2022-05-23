package bd;

import java.sql.*;
import utils.Utilidades;

/**
 * Clase para instancia única de conexión a base de datos
 *
 * @author Aarón Durán
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
 */
public class BD {

    private static BD instancia;
    private static final String[] CONFIG_BD = Utilidades.leerConfiguracionBD();

    private static Connection conn = null;

    private BD() {
        try {
            conn = DriverManager.getConnection("jdbc:mysql://" + CONFIG_BD[0] + ":" + CONFIG_BD[1] + "/" + CONFIG_BD[2], CONFIG_BD[3], CONFIG_BD[4]);
        } catch (SQLException e) {
            System.err.println("No se ha podido establecer la conexión a la base de datos");
        }
    }

    public Connection conexionBD() {
        return conn;
    }

    public static BD obtenerInstancia() throws SQLException {
        if (instancia == null) {
            instancia = new BD();

        } else if (instancia.conexionBD().isClosed()) {
            instancia = new BD();
        }
        return instancia;
    }
}
