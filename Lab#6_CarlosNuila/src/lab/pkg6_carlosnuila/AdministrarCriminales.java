/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg6_carlosnuila;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos Nuila
 */
public class AdministrarCriminales {

    private ArrayList<Criminal> listaCriminales = new ArrayList();
    private File archivo = null;

    public AdministrarCriminales(String path) {
        archivo = new File(path);
    }

    public ArrayList<Criminal> getListaCriminales() {
        return listaCriminales;
    }

    public void setListaCriminales(ArrayList<Criminal> listaCriminales) {
        this.listaCriminales = listaCriminales;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "Lista Criminales: " + listaCriminales;
    }

    public void setCriminal(Criminal c) {
        this.listaCriminales.add(c);
    }

    public void setDelito(Delito d, int numeroPersona) {
        this.listaCriminales.get(numeroPersona).getListaDelitos().add(d);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            int i = 0;
            for (Criminal temp : listaCriminales) {
                bw.write(temp.getNombre() + ";");
                bw.write(temp.getEdad() + ";");
                bw.write(temp.getNumeroIdentidad() + ";");
                bw.write(temp.getNumeroCelda() + ";");
                for (Delito temp2 : listaCriminales.get(i).getListaDelitos()) {
                    if (temp2 instanceof Asesinato) {
                        bw.write("Asesinato,");
                        bw.write(temp2.getDescripcion() + ",");
                        bw.write(temp2.getGravedad() + ",");
                        bw.write(temp2.getCulpable() + ",");
                        bw.write(((Asesinato) temp2).getArma() + ",");
                        bw.write(((Asesinato) temp2).getNumeroVictimas() + ",");
                    }
                    if (temp2 instanceof Violacion) {
                        bw.write("Violacion,");
                        bw.write(temp2.getDescripcion() + ",");
                        bw.write(temp2.getGravedad() + ",");
                        bw.write(temp2.getCulpable() + ",");
                        bw.write(((Violacion) temp2).getEdadVictima() + ",");
                    }
                    if (temp2 instanceof Robo) {
                        bw.write("Robo,");
                        bw.write(temp2.getDescripcion() + ",");
                        bw.write(temp2.getGravedad() + ",");
                        bw.write(temp2.getCulpable() + ",");
                        bw.write(((Robo) temp2).getObjetoRobado() + ",");
                        bw.write(((Robo) temp2).getValorObjeto() + ",");
                    }
                    if (temp2 instanceof TraficoDrogas) {
                        bw.write("Trafico de drogas,");
                        bw.write(temp2.getDescripcion() + ",");
                        bw.write(temp2.getGravedad() + ",");
                        bw.write(temp2.getCulpable() + ",");
                        bw.write(((TraficoDrogas) temp2).getNombreProducto() + ",");
                        bw.write(((TraficoDrogas) temp2).getPeso() + ",");
                    }
                    if (temp2 instanceof Secuestro) {
                        bw.write("Secuestro,");
                        bw.write(temp2.getDescripcion() + ",");
                        bw.write(temp2.getGravedad() + ",");
                        bw.write(temp2.getCulpable() + ",");
                        bw.write(((Secuestro) temp2).getTiempoSecuestrado() + ",");
                        bw.write(((Secuestro) temp2).getEdadVictima() + ",");
                    }

                }
                bw.write(";" + temp.getAñosCumplir() + ";");
                i++;
            }
            bw.flush();
        } catch (Exception e) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listaCriminales = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ArrayList<Delito> temp = new ArrayList();
                    String nombre = sc.next();
                    int edad = sc.nextInt();
                    String numeroIdentidad = sc.next();
                    int numeroCelda = sc.nextInt();
                    Scanner sc2 = new Scanner(sc.next());
                    sc2.useDelimiter(",");
                    while (sc2.hasNext()) {
                        if (sc2.next().equals("Asesinato")) {
                            String descrip = sc2.next();
                            String gravedad = sc2.next();
                            String culpable = sc2.next();
                            String nombreArma = sc2.next();
                            int numeroVictimas = sc2.nextInt();
                            temp.add(new Asesinato(nombreArma, numeroVictimas, descrip, gravedad, culpable));
                            break;
                            
                        }
                        if (sc2.next().equals("Violacion")) {
                            String descrip = sc2.next();
                            String gravedad = sc2.next();
                            String culpable = sc2.next();
                            temp.add(new Violacion(sc2.nextInt(), descrip, gravedad, culpable));
                            break;
                        }
                        if (sc2.next().equals("Robo")) {
                            String descrip = sc2.next();
                            String gravedad = sc2.next();
                            String culpable = sc2.next();
                            temp.add(new Robo(sc2.next(), sc2.nextDouble(), descrip, gravedad, culpable));
                            break;
                        }
                        if (sc2.next().equals("Trafico de drogas")) {
                            String descrip = sc2.next();
                            String gravedad = sc2.next();
                            String culpable = sc2.next();
                            temp.add(new TraficoDrogas(sc2.next(), sc2.nextDouble(), descrip, gravedad, culpable));
                            break;
                        }
                        if (sc2.next().equals("Secuestro")) {
                            String descrip = sc2.next();
                            String gravedad = sc2.next();
                            String culpable = sc2.next();
                            temp.add(new Secuestro(sc2.nextInt(), sc2.nextInt(), descrip, gravedad, culpable));
                            break;
                        }
                    }
                    int añosCumplir = sc.nextInt();
                    listaCriminales.add(new Criminal(nombre, edad, numeroIdentidad, numeroCelda, añosCumplir));
                    listaCriminales.get(listaCriminales.size() - 1).setListaDelitos(temp);
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            sc.close();
        }
    }

}
