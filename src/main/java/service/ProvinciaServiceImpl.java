/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
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
        this.almacenarArchivo(provincia, "C:/Netbeans1/provincia.dat");
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
    
    @Override
    public void almacenarArchivo(Provincia provincia, String ruta) {
        DataOutputStream salida = null;

        try {
            salida = new DataOutputStream(new FileOutputStream(ruta, true));

            salida.writeInt(provincia.getCodigo());
            salida.writeInt(provincia.getNumeroCantones());
            salida.writeInt(provincia.getNumeroCiudades());
            salida.writeInt(provincia.getNumeroHabitantes());
            salida.writeInt(provincia.getHabitantesRemunerados());
            salida.writeInt(provincia.getHabitantesSinTrabajo());

            ObjectOutputStream salida1 = null;
            salida1 = new ObjectOutputStream(new FileOutputStream(new File(ruta), true));
            salida1.writeObject(provincia.getPais());

        } catch (IOException ex) {
            Logger.getLogger(ProvinciaServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Provincia> recuperarArchivo(String ruta) {
        var provinciaList = new ArrayList<Provincia>();
        DataInputStream entrada = null;
        try {
            entrada = new DataInputStream(new FileInputStream(ruta));
            while (true) {
                var codigo = entrada.readInt();
                var numeroCantones = entrada.readUTF();
                var numeroCiudades = entrada.readInt();
                var numeroHabitantes = entrada.readInt();
                var habitantesRemunerados = entrada.readInt();
                var habitantesSinTrabajo = entrada.readInt();

                ObjectInputStream entrada1 = null;
                entrada1 = new ObjectInputStream(entrada1);
                Provincia provincia = (Provincia) entrada1.readObject();
                provinciaList.add(provincia);

            }

        } catch (IOException e) {
            try {
                entrada.close();
            } catch (IOException ex) {
                Logger.getLogger(CantonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CantonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return provinciaList;
    }
}
