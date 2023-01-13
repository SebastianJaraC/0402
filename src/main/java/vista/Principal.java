/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

/**
 *
 * @author Andres Ochoa
 */
public class Principal {
    public static void main(String[] args) {
        var ventana = new VentanaCanton();
        var ventana1 = new VentanaPais();
        var ventana2 = new VentanaProvincia();
        
        ventana.setVisible(true);
        ventana1.setVisible(true);
        ventana2.setVisible(true);
    }
}
