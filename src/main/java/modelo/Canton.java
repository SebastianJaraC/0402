/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author andyj
 */
public class Canton {
    
    private int codigo;
    private Provincia provincia;
    private String nombreCanton;
    private int areaTotalM2;
    private int upsActivas;
    private int universidadesDisponibles;
    private int numeroHabitantes;
    

    public Canton(int codigo,String nombreCanton, int areaTotalM2, int upsActivas, int universidadesDisponibles, int numeroHabitantes,Provincia provincia) {
        this.nombreCanton = nombreCanton;
        this.areaTotalM2 = areaTotalM2;
        this.upsActivas = upsActivas;
        this.universidadesDisponibles = universidadesDisponibles;
        this.numeroHabitantes = numeroHabitantes;
        this.provincia = provincia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getNombreCanton() {
        return nombreCanton;
    }

    public void setNombreCanton(String nombreCanton) {
        this.nombreCanton = nombreCanton;
    }

    public int getAreaTotalM2() {
        return areaTotalM2;
    }

    public void setAreaTotalM2(int areaTotalM2) {
        this.areaTotalM2 = areaTotalM2;
    }

    public int getUpsActivas() {
        return upsActivas;
    }

    public void setUpsActivas(int upsActivas) {
        this.upsActivas = upsActivas;
    }

    public int getUniversidadesDisponibles() {
        return universidadesDisponibles;
    }

    public void setUniversidadesDisponibles(int universidadesDisponibles) {
        this.universidadesDisponibles = universidadesDisponibles;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    @Override
    public String toString() {
        return "Canton{" + "nombreCanton=" + nombreCanton + ", areaTotalM2=" + areaTotalM2 + ", upsActivas=" + upsActivas + ", universidadesDisponibles=" + universidadesDisponibles + ", numeroHabitantes=" + numeroHabitantes + '}';
    }

    

    
    
}
