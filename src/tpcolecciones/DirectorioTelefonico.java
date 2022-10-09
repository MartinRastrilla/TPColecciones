package tpcolecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;


public class DirectorioTelefonico {
    HashMap<String, Cliente> directorio = new HashMap();

    public DirectorioTelefonico() {
    }
    
    public void agregarCliente(String nroTel, Cliente cliente){
        if(!directorio.containsKey(nroTel)) {
            directorio.put(nroTel,cliente);
            JOptionPane.showMessageDialog(null,"Cliente agregado");
        } else {
            JOptionPane.showMessageDialog(null,"Cliente ya existente");
        }

        directorio.put(nroTel, cliente);
    }
    public Cliente buscarCliente(String nroTel){
        return directorio.get(nroTel);
    }
    
    public ArrayList<String> buscarTelefono(String apellido){
        ArrayList<String> listaTelefono = new ArrayList();
        for (Map.Entry<String, Cliente> aux : directorio.entrySet()) {
            if (aux.getValue().getApellido().equalsIgnoreCase(apellido)) {
                listaTelefono.add(aux.getKey());
            }
        }
        return listaTelefono;
    }
    
    public ArrayList<Cliente> buscarClientes(String ciudad){
        ArrayList<Cliente> listaCliente = new ArrayList();
        for (Map.Entry<String, Cliente> aux : directorio.entrySet()) {
            if (aux.getValue().getCiudad().equalsIgnoreCase(ciudad)) {
                listaCliente.add(aux.getValue());
                JOptionPane.showMessageDialog(null,"Cliente agregado de ciudad de: "+ciudad);
            }
        }
        return listaCliente;
    }
    public void borrarCliente(String nroTel){
        if (directorio.containsKey(nroTel)) {
            JOptionPane.showMessageDialog(null,"Eliminado con éxito.");
            directorio.remove(nroTel);
        } else {
            JOptionPane.showMessageDialog(null,"No existe ese número en el directorio.");
        }
    }
    
}
