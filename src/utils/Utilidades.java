package utils;

import excepciones.DNIIncorrectoExcepcion;
import excepciones.IBANIncorrectoExcepcion;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Properties;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Métodos con utilidades varias
 *
 * @author Aarón Durán
 *
 */
public class Utilidades {

    private final static String PATRON_DNI = "\\d{8}[A-Z]{1}";
    private static final String PATRON_IBAN = "^ES\\d{22}$";

    /**
     * Método que comprueba si una cadena cumple una expresión regular
     *
     * @param cadena Cadena a comprobar
     * @param expresion Expresión regular
     * @return true/false
     */
    private static boolean comprobarPatron(String cadena, String expresion) {
        Pattern patron = Pattern.compile(expresion);
        Matcher coincidencia = patron.matcher(cadena);
        return coincidencia.matches();
    }

    /**
     * Método que calcula la letra de un DNI a partir de sus dígitos
     *
     * @param dni Dígitos del DNI
     * @return Letra del DNI
     */
    private static String calcularLetraDNI(int dni) {
        String[] arrLetras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B",
            "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int intModulo = dni % 23;
        return arrLetras[intModulo];
    }

    /**
     * Método que comprueba si un DNI cumple la expresión regular y su letra es
     * correcta
     *
     * @param dni DNI a comprobar
     * @return true/false
     * @throws DNIIncorrectoExcepcion Excepción con error de validación de DNI
     */
    public static boolean comprobarDNI(String dni) throws DNIIncorrectoExcepcion {
        boolean esCorrecto = false;
        if (!comprobarPatron(dni, PATRON_DNI)) {
            throw new DNIIncorrectoExcepcion(2);
        } else {
            if (!dni.substring(8).equals(calcularLetraDNI(Integer.parseInt(dni.substring(0, 8))))) {
                throw new DNIIncorrectoExcepcion(1);
            } else {
                esCorrecto = true;
            }
        }
        return esCorrecto;
    }

    /**
     * Método que comprueba si un IBAN cumple la expresión regular adecuada
     *
     * @param iban IBAN a comprobar
     * @return true/false
     * @throws IBANIncorrectoExcepcion Excepción con error de validación de IBAN
     */
    public static boolean comprobarIBAN(String iban) throws IBANIncorrectoExcepcion {
        boolean esCorrecto = false;
        if (!comprobarPatron(iban, PATRON_IBAN)) {
            throw new IBANIncorrectoExcepcion();
        } else {
            esCorrecto = true;
        }
        return esCorrecto;
    }

    /**
     * Método que carga la configuración usando la clase Properties
     *
     * @return Array de cadenas con la configuración
     */
    public static String[] leerConfiguracionBD() {
        Properties configuracion = new Properties();
        try {
            String[] parametros = new String[5];
            configuracion.load(new FileInputStream("configuracion.conf"));
            parametros[0] = configuracion.getProperty("servidor");
            parametros[1] = configuracion.getProperty("puerto");
            parametros[2] = configuracion.getProperty("bd", "operadora");
            parametros[3] = configuracion.getProperty("usuario");
            parametros[4] = configuracion.getProperty("pass");
            return parametros;

        } catch (IOException e) {
            Log.escribirLog(Log.ERROR, e.getMessage());
        }
        return null;
    }

    /**
     * Método que escribe la configuración de la base de datos usando la clase
     * Properties
     *
     * @param servidor Dirección del servidor
     * @param puerto Puerto del servidor
     * @param bd Nombre de la base de datos
     * @param usuario Usuario de la base de datos
     * @param pass Contraseña de la base de datos
     */
    public static void escribirConfiguracionBD(String servidor, String puerto, String bd, String usuario, String pass) {
        Properties configuracion = new Properties();
        configuracion.setProperty("servidor", servidor);
        configuracion.setProperty("puerto", puerto);
        configuracion.setProperty("bd", bd);
        configuracion.setProperty("usuario", usuario);
        configuracion.setProperty("pass", pass);

        try (FileWriter fw = new FileWriter("configuracion.conf", Charset.forName("UTF-8"))) {
            configuracion.store(fw, "Configuración de la aplicación Operadora");
        } catch (IOException e) {
            Log.escribirLog(Log.ERROR, e.getMessage());
        }

    }

}
