package utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Clase Log que permite leer y escribir archivos de registro
 *
 * @author Aarón Durán
 *
 */
public class Log {

    private static DateTimeFormatter formatoFechaHora = DateTimeFormatter.ofPattern("dd/MM/uuuu HH:mm:ss");
    private static DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-uuuu");
    /**
     * Constante con el código ERROR
     */
    public static final String ERROR = "ERROR";

    /**
     * Constante con el código INFO
     */
    public static final String INFO = "INFO";

    /**
     * Método que escribe una línea de log en un archivo
     *
     * @param nivelLog Tipo de mensaje a registrar
     * @param mensaje Línea a registrar
     */
    public static void escribirLog(String nivelLog, String mensaje) {
        String lineaLog = nivelLog + "///" + formatoFechaHora.format(LocalDateTime.now()) + "///" + mensaje + "\n";
        File archivo = new File("logs" + File.separator + formatoFecha.format(LocalDateTime.now()) + ".log");
        // El valor true en el objeto FileWriter permite añadir líneas al archivo y no sobrescribirlo
        try (FileWriter fw = new FileWriter(archivo, true); BufferedWriter bfw = new BufferedWriter(fw)) {
            bfw.write(lineaLog);
        } catch (IOException e) {
            System.err.println(e);
        }
    }

    /**
     * Método que lee un archivo log
     *
     * @param ruta Ruta del archivo
     * @return ArrayList con las líneas del archivo
     */
    public static ArrayList<String> leerLog(String ruta) {
        ArrayList<String> lineas = new ArrayList<>();
        File archivo = new File(ruta);

        try (FileReader fr = new FileReader(archivo); BufferedReader leer = new BufferedReader(fr)) {
            String linea;
            while ((linea = leer.readLine()) != null) {
                lineas.add(linea);
            }

        } catch (IOException e) {
            System.err.println(e);

        }
        return lineas;
    }

}
