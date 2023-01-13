/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
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
    
}
