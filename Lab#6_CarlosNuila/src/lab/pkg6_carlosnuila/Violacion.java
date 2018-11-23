/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_carlosnuila;

/**
 *
 * @author Carlos Nuila
 */
public class Violacion extends Delito {
    
    private int edadVictima;

    public Violacion() {
    }

    public Violacion(int edadVictima, String descripcion, String gravedad, String culpable) {
        super(descripcion, gravedad, culpable);
        this.edadVictima = edadVictima;
    }

    public int getEdadVictima() {
        return edadVictima;
    }

    public void setEdadVictima(int edadVictima) {
        this.edadVictima = edadVictima;
    }
    
    
    
    
}
