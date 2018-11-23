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
public class Asesinato extends Delito {

    private String arma;
    private int numeroVictimas;

    public Asesinato() {
    }

    public Asesinato(String arma, int numeroVictimas, String descripcion, String gravedad, String culpable) {
        super(descripcion, gravedad, culpable);
        this.arma = arma;
        this.numeroVictimas = numeroVictimas;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getNumeroVictimas() {
        return numeroVictimas;
    }

    public void setNumeroVictimas(int numeroVictimas) {
        this.numeroVictimas = numeroVictimas;
    }
    
    

}
