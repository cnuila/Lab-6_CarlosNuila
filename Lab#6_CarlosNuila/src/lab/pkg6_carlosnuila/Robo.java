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
public class Robo extends Delito {
    
    private String objetoRobado;
    private double valorObjeto;

    public Robo() {
    }

    public Robo(String objetoRobado, double valorObjeto, String descripcion, String gravedad, String culpable) {
        super(descripcion, gravedad, culpable);
        this.objetoRobado = objetoRobado;
        this.valorObjeto = valorObjeto;
    }

    public String getObjetoRobado() {
        return objetoRobado;
    }

    public void setObjetoRobado(String objetoRobado) {
        this.objetoRobado = objetoRobado;
    }

    public double getValorObjeto() {
        return valorObjeto;
    }

    public void setValorObjeto(double valorObjeto) {
        this.valorObjeto = valorObjeto;
    }
    
    
    
    
}
