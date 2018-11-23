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
public class TraficoDrogas extends Delito{
    
    private String nombreProducto;
    private double peso;

    public TraficoDrogas() {
    }

    public TraficoDrogas(String nombreProducto, double peso, String descripcion, String gravedad, String culpable) {
        super(descripcion, gravedad, culpable);
        this.nombreProducto = nombreProducto;
        this.peso = peso;
    }


    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
