/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import modelo.Canton;

/**
 *
 * @author andyj
 */
public class CantonServiceImpl implements CantonService{

    private static List<Canton> cantonList= new ArrayList<>();
    
    @Override
    public void crear(Canton canton) {
        this.cantonList.add(canton);
    }

    @Override
    public Canton buscarPorCodigo(int codigo) {
        Canton retorno=null;
        for(var canton:this.cantonList){
            if(codigo==canton.getCodigo()){
                retorno=canton;
                break;
            }
        }
        return retorno;
    }
    
    @Override
    public List<Canton> listar() {
        return this.cantonList;
    }    

    @Override
    public void eliminar(int codigo) {
       var indice = 0;
        for(var materia: this.cantonList)
            if(materia.getCodigo()==codigo){
                this.cantonList.remove(indice);
                break;
            }else{
                indice++;
            }
    }
    
}
