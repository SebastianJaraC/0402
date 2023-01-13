/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import modelo.Canton;

/**
 *
 * @author andyj
 */
public interface CantonService {

    
    public void crear(Canton canton);

    public Canton buscarPorCodigo(int codigo);
    public void eliminar(int codigo);
    public List<Canton> listar();
}
