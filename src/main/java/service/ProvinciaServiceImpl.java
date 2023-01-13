/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import modelo.Provincia;

/**
 *
 * @author andyj
 */
public class ProvinciaServiceImpl implements ProvinciaService{

    private static List<Provincia> provinciaList= new ArrayList<>();
    
    @Override
    public void crear(Provincia provincia) {
        this.provinciaList.add(provincia);
    }

    @Override
    public Provincia buscarPorCodigo(int codigo) {
        Provincia retorno=null;
        for(var provincia:this.provinciaList){
            if(codigo==provincia.getCodigo()){
                retorno=provincia;
                break;
            }
        }
        return retorno;
    }
    
    @Override
    public List<Provincia> listar() {
        return this.provinciaList;
    }    

    @Override
    public void eliminar(int codigo) {
    
        var indice = 0;
        for(var materia: this.provinciaList)
            if(materia.getCodigo()==codigo){
                this.provinciaList.remove(indice);
                break;
            }else{
                indice++;
            }
    }
}
