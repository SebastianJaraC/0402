/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Pais;
import service.PaisServiceImpl;

/**
 *
 * @author andyj
 */
public class PaisControl {
    
    private PaisServiceImpl paisServiceImpl;
    
    public PaisControl() {
        paisServiceImpl = new PaisServiceImpl();
        
    }
    
    public void crear(String[] data) {
        
        var codigo = Integer.valueOf(data[0]);
        var numeroCiudades = Integer.valueOf(data[1]);
        var numeroHabitantes = Integer.valueOf(data[2]);
        var tieneEstados = data[3];
        var tipoMoneda = data[4];
        var numeroEstados = Integer.valueOf(data[5]);
        var numeroReferencia = Integer.valueOf(data[6]);        
        
        var pais = new Pais(codigo, numeroCiudades, numeroHabitantes, tieneEstados, tipoMoneda, numeroEstados, numeroReferencia);
        this.paisServiceImpl.crear(pais);
        
    }
    
    public List<Pais> listar() {
        return this.paisServiceImpl.listar();
    }

    public void eliminar(String[] data) {
        var codigo = Integer.valueOf(data[0]);
        this.paisServiceImpl.eliminar(codigo);
    }
    
}
