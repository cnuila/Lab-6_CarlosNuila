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
public class Secuestro extends Delito {
    
    private int tiempoSecuestrado;
    private int edadVictima;

    public Secuestro() {
    }

    public Secuestro(int tiempoSecuestrado, int edadVictima, String descripcion, String gravedad, String culpable) {
        super(descripcion, gravedad, culpable);
        this.tiempoSecuestrado = tiempoSecuestrado;
        this.edadVictima = edadVictima;
    }

    
    
    public int getTiempoSecuestrado() {
        return tiempoSecuestrado;
    }

    public void setTiempoSecuestrado(int tiempoSecuestrado) {
        this.tiempoSecuestrado = tiempoSecuestrado;
    }

    public int getEdadVictima() {
        return edadVictima;
    }

    public void setEdadVictima(int edadVictima) {
        this.edadVictima = edadVictima;
    }
    
}
