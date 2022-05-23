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
 * @author Alejandro Fonterosa
 * @author Germán Vaquero
 */
public class XML {

    public static String[] leerConfiguracion() {
        File archivo = new File("configuracion.xml");
        try ( FileInputStream fis = new FileInputStream(archivo);  InputStreamReader isr = new InputStreamReader(fis, "UTF-8")) {
            String[] configuracion = new String[3];
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dB = factory.newDocumentBuilder();
            Document doc = dB.parse(new InputSource(isr));
            configuracion[0] = doc.getElementsByTagName("urlbd").item(0).getTextContent();
            configuracion[1] = doc.getElementsByTagName("usuario").item(0).getTextContent();
            configuracion[2] = doc.getElementsByTagName("contraseña").item(0).getTextContent();
            return configuracion;
        } catch (Exception e) {
            Log.escribirLog(Log.ERROR, e.getMessage());
        }
        return null;
    }

}
