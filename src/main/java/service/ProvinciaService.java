/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import modelo.Provincia;


/**
 *
 * @author andyj
 */
public interface ProvinciaService {
    
    
    public void crear(Provincia provincia);
    
    public void eliminar(int codigo);
    
    public Provincia buscarPorCodigo(int codigo);

    public List<Provincia> listar();
    
}
