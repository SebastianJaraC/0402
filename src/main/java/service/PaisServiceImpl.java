/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.ArrayList;
import java.util.List;
import modelo.Pais;

/**
 *
 * @author andyj
 */

    
    public class PaisServiceImpl implements PaisService{

    private static List<Pais> paisList= new ArrayList<>();
    
    @Override
    public void crear(Pais pais) {
        this.paisList.add(pais);
    }

    @Override
    public Pais buscarPorCodigo(int codigo) {
        Pais retorno=null;
        for(var pais:this.paisList){
            if(codigo==pais.getCodigo()){
                retorno=pais;
                break;
            }
        }
        return retorno;
    }
    
    @Override
    public List<Pais> listar() {
        return this.paisList;
    }    

    @Override
    public void eliminar(int codigo) {
    
        var indice = 0;
        for(var materia: this.paisList)
            if(materia.getCodigo()==codigo){
                this.paisList.remove(indice);
                break;
            }else{
                indice++;
            }
    }
    
}
