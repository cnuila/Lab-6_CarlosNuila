/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_carlosnuila;

import java.util.ArrayList;

/**
 *
 * @author Carlos Nuila
 */
public class Criminal {
    
    private String nombre;
    private int edad;
    private String numeroIdentidad;
    private int numeroCelda;
    private ArrayList<Delito> listaDelitos = new ArrayList();
    private int añosCumplir;
    private String expediente = "";

    public Criminal() {
    }

    public Criminal(String nombre, int edad, String numeroIdentidad, int numeroCelda, int añosCumplir) {
        this.nombre = nombre;
        this.edad = edad;
        this.numeroIdentidad = numeroIdentidad;
        this.numeroCelda = numeroCelda;
        this.añosCumplir = añosCumplir;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNumeroIdentidad() {
        return numeroIdentidad;
    }

    public void setNumeroIdentidad(String numeroIdentidad) {
        this.numeroIdentidad = numeroIdentidad;
    }

    public int getNumeroCelda() {
        return numeroCelda;
    }

    public void setNumeroCelda(int numeroCelda) {
        this.numeroCelda = numeroCelda;
    }

    public ArrayList<Delito> getListaDelitos() {
        return listaDelitos;
    }

    public void setListaDelitos(ArrayList<Delito> listaDelitos) {
        this.listaDelitos = listaDelitos;
    }

    public int getAñosCumplir() {
        return añosCumplir;
    }

    public void setAñosCumplir(int añosCumplir) {
        this.añosCumplir = añosCumplir;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    public String expediente(){
        expediente += "Nombre: " + nombre + "\n";
        expediente += "Edad: " + edad + "\n";
        expediente += "Numero de ID: " + numeroIdentidad + "\n";
        expediente += "Numero Celda: " + numeroCelda + "\n";
        expediente += "Delitos:\n";
        expediente += "\n";
        int i = 0;
        for (Delito temp : listaDelitos) {
            expediente += "     "
        }
        
        return expediente;
    }
    
    
}
