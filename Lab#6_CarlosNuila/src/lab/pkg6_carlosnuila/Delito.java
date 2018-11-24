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
public class Delito {
    
    protected String descripcion;
    protected String gravedad;
    protected String culpable;

    public Delito() {
    }

    public Delito(String descripcion, String gravedad, String culpable) {
        this.descripcion = descripcion;
        this.gravedad = gravedad;
        this.culpable = culpable;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getGravedad() {
        return gravedad;
    }

    public void setGravedad(String gravedad) {
        this.gravedad = gravedad;
    }

    public String getCulpable() {
        return culpable;
    }

    public void setCulpable(String culpable) {
        this.culpable = culpable;
    }

    @Override
    public String toString() {
        return "descripcion=" + descripcion + ", gravedad=" + gravedad + ", culpable=" + culpable;
    }
    
    
}
