package interfaces;

import java.util.ArrayList;
import operadora.Cliente;
import operadora.Contrato;
import operadora.LineaMovil;

/**
 *
 * @author a21aarondn
 */
public interface BDMetodos {

    /* Métodos para crear y editar clientes */
    public boolean insertarCliente();

    public boolean modificarCliente();

    public boolean eliminarCliente();

    /* Métodos para crear y editar contratos */
    public boolean insertarContrato();

    public boolean modificarContrato();

    public boolean eliminarContrato();

    /* Métodos para crear y editar líneas móviles */
    public boolean insertarLineaMovil();

    public boolean modificarLineaMovil();

    public boolean eliminarLineaMovil();

    /* Métodos para lectura de clientes, contratos y líneas */
    public Cliente leerCliente();

    public Contrato leerContrato();

    public LineaMovil leerLineaMovil();

    /* Métodos de búsqueda */
    public ArrayList<Cliente> listarClientes();

    public int buscarCliente();
}
