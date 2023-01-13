/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author andyj
 */
public class Pais {
    
    private int codigo;
    private int numeroReferencia;
    private int numeroCiudades;
    private int numeroHabitantes;
    private String tieneEstados;
    private String tipoMoneda;
    private int numeroEstados;

    public Pais(int codigo, int numeroCiudades, int numeroHabitantes, String tieneEstados, String tipoMoneda, int numeroEstados, int numeroReferencia) {
        this.codigo = codigo;
        this.numeroCiudades = numeroCiudades;
        this.numeroHabitantes = numeroHabitantes;
        this.tieneEstados = tieneEstados;
        this.tipoMoneda = tipoMoneda;
        this.numeroEstados = numeroEstados;
         this.numeroReferencia = numeroReferencia;
    }  

    public int getNumeroCiudades() {
        return numeroCiudades;
    }

    public void setNumeroCiudades(int numeroCiudades) {
        this.numeroCiudades = numeroCiudades;
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getTieneEstados() {
        return tieneEstados;
    }

    public void setTieneEstados(String tieneEstados) {
        this.tieneEstados = tieneEstados;
    }

    public String getTipoMoneda() {
        return tipoMoneda;
    }

    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    }

    public int getNumeroEstados() {
        return numeroEstados;
    }

    public void setNumeroEstados(int numeroEstados) {
        this.numeroEstados = numeroEstados;
    }

    public int getNumeroReferencia() {
        return numeroReferencia;
    }

    public void setNumeroReferencia(int numeroReferencia) {
        this.numeroReferencia = numeroReferencia;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    

    @Override
    public String toString() {
        return "Pais{" + "numeroCiudades=" + numeroCiudades + ", numeroHabitantes=" + numeroHabitantes + ", tieneEstados=" + tieneEstados + ", tipoMoneda=" + tipoMoneda + ", numeroEstados=" + numeroEstados + '}';
    }
    
}
