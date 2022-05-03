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
public class BDInsertar {

    private static PreparedStatement preStmt;
    private static ResultSet rs;
    private static BD bd = new BD("jdbc:mysql://localhost:3307/operadora", "root", "root");
}
