/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;

import modelo.Provincia;
import service.PaisServiceImpl;
import service.ProvinciaServiceImpl;

/**
 *
 * @author andyj
 */
public class ProvinciaControl {

    private PaisServiceImpl paisserviceImpl = new PaisServiceImpl();

    private ProvinciaServiceImpl provinciaServiceImpl;

    public ProvinciaControl() {
        provinciaServiceImpl = new ProvinciaServiceImpl();

    }

    public void crear(String[] data) {

        var codigo = Integer.valueOf(data[0]);
        var numeroCantones = Integer.valueOf(data[1]);
        var numeroCiudades = Integer.valueOf(data[2]);
        var nuemeroHabitantes = Integer.valueOf(data[3]);
        var habitantesRemunerados = Integer.valueOf(data[4]);
        var habitantesSinTrabajo = Integer.valueOf(data[5]);
        var pais = this.paisserviceImpl.buscarPorCodigo(Integer.valueOf(data[6]));

        var provincia = new Provincia(codigo, numeroCantones, numeroCiudades, nuemeroHabitantes, habitantesRemunerados, habitantesSinTrabajo, pais);
        this.provinciaServiceImpl.crear(provincia);

    }

    public List<Provincia> listar() {
        return this.provinciaServiceImpl.listar();
    }
    
    public void eliminar(String[] data){
        var codigo=Integer.valueOf(data[0]);
        this.provinciaServiceImpl.eliminar(codigo);
    }

}
