/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_lab7;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author dcasc
 */
public class Tablaposiciones {
    private ArrayList<Equipos> ligaFutbol =new ArrayList();
    private File archivo=null;

    public ArrayList<Equipos> getLigaFutbol() {
        return ligaFutbol;
    }

    public void setLigaFutbol(ArrayList<Equipos> ligaFutbol) {
        this.ligaFutbol = ligaFutbol;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
}
