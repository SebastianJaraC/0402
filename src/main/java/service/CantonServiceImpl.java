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
        this.almacenarArchivo(canton, "C:/Netbeans1/canton.dat");
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
    @Override
    public void almacenarArchivo(Canton canton, String ruta) {
        DataOutputStream salida = null;

        try {
            salida = new DataOutputStream(new FileOutputStream(ruta, true));

            salida.writeInt(canton.getCodigo());
            salida.writeUTF(canton.getNombreCanton());
            salida.writeInt(canton.getAreaTotalM2());
            salida.writeInt(canton.getUpsActivas());
            salida.writeInt(canton.getUniversidadesDisponibles());
            salida.writeInt(canton.getNumeroHabitantes());
            
            
            
            ObjectOutputStream salida1 = null;
            salida1 = new ObjectOutputStream(new FileOutputStream(new File(ruta), true));
            salida1.writeObject(canton.getProvincia());

        } catch (IOException ex) {
            Logger.getLogger(CantonServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @Override
    public List<Canton> recuperarArchivo(String ruta) {
        var cantonList = new ArrayList<Canton>();
        DataInputStream entrada = null;
        try {
            entrada = new DataInputStream(new FileInputStream(ruta));
            while (true) {
                var codigo = entrada.readInt();
                var nombreCanton = entrada.readUTF();
                var areaTotalM2 = entrada.readInt();
                var upsActivas = entrada.readInt();
                var universidadesDisponibles = entrada.readInt();
                var numeroHabitantes = entrada.readInt();
                var provincia = entrada.readUTF();
                
                
                ObjectInputStream entrada1 = null;
                entrada1 = new ObjectInputStream(entrada1);
                Canton canton = (Canton) entrada1.readObject();
                cantonList.add(canton);
                
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
        return cantonList;
    }
}
