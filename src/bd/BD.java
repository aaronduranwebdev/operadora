package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Clase BD que genera una conexión a base de datos
 *
 * @author Aarón Durán
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
 */
public class BD {

    public Connection conexion;

    private String dbURL;
    private String dbUsuario;
    private String dbContraseña;

    public BD(String dbURL, String dbUsuario, String dbContraseña) {
        this.dbURL = dbURL;
        this.dbUsuario = dbUsuario;
        this.dbContraseña = dbContraseña;
        this.conexion = null;

        try {
            conexion = DriverManager.getConnection(this.dbURL, this.dbUsuario, this.dbContraseña);
            //System.out.println("Conectado");

        } catch (SQLException e) {
            System.out.println("Consulta fallida: " + e.getMessage());
        }
    }

}
