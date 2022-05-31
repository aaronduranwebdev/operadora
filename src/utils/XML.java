package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;

/**
 * Clase XML que permite interactuar con archivos XML
 *
 * @author Aarón Durán
 *
 */
public class XML {

    /**
     * Método que lee la configuración de la apariencia desde un XML
     *
     * @return Array de Strings coa configuración
     */
    public static String[] leerConfiguracion() {
        File archivo = new File("apariencia.xml");
        try (FileInputStream fis = new FileInputStream(archivo); InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {
            String[] configuracion = new String[3];
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = factory.newDocumentBuilder();
            Document doc = dB.parse(new InputSource(isr));
            configuracion[0] = doc.getElementsByTagName("fuente").item(0).getTextContent();
            configuracion[1] = doc.getElementsByTagName("estilo").item(0).getTextContent();
            configuracion[2] = doc.getElementsByTagName("tamaño").item(0).getTextContent();
            return configuracion;
        } catch (Exception e) {
            Log.escribirLog(Log.ERROR, e.getMessage());
        }
        return null;
    }

}
