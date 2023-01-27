/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        this.almacenarArchivo(pais, "C:/Netbeans1/pais.dat");
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
    
    @Override
    public void almacenarArchivo(Pais pais, String ruta) {
        DataOutputStream salida = null;

        try {
            salida = new DataOutputStream(new FileOutputStream(ruta, true));
            salida.writeInt(pais.getCodigo());
            salida.writeInt(pais.getNumeroReferencia());
            salida.writeInt(pais.getNumeroCiudades());
            salida.writeInt(pais.getNumeroEstados());
            salida.writeInt(pais.getNumeroHabitantes());
            salida.writeUTF(pais.getTieneEstados());
            salida.writeUTF(pais.getTipoMoneda());

        } catch (IOException ex) {
            Logger.getLogger(PaisServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Pais> recuperarArchivo(String ruta) {
        var paisList = new ArrayList<Pais>();
        DataInputStream entrada = null;
        try {
            entrada = new DataInputStream(new FileInputStream(ruta));
            while (true) {
                var codigo = entrada.readInt();
                var numeroReferencia = entrada.readInt();
                var numeroCiudades = entrada.readInt();
                var numeroEstados = entrada.readInt();
                var numeroHabitantes = entrada.readInt();
                var tieneEstados = entrada.readUTF();
                var tipoMoneda = entrada.readUTF();
                var pais = new Pais(codigo, numeroCiudades, numeroHabitantes, tieneEstados, tipoMoneda,  numeroEstados, numeroReferencia);
                paisList.add(pais);
                
            }
        } catch (IOException e) {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(PaisServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return paisList;
    }

    public    List<Pais> getCiudadList() {
        return paisList;
    }

    public   void setCiudadList(List<Pais> ciudadList) {
        PaisServiceImpl.paisList = paisList;
    }
}
