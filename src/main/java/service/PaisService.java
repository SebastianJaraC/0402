///*
 
package service;


import java.util.List;
import modelo.Pais;

/**
 *
 * @author andyj
 */
public interface PaisService {
    
    public void crear(Pais pais);

    public Pais buscarPorCodigo(int codigo);

    public void eliminar(int codigo);

    public List<Pais> listar();

    public void almacenarArchivo(Pais pais, String ruta);

    public List<Pais> recuperarArchivo(String ruta);
}
