/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_lab7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

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
    public void setEquipos(Equipos e){
        this.ligaFutbol.add(e);
        
    }
     public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Equipos t : ligaFutbol) {
                bw.write(t.getNombreequipo());
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }
     public void cargarArchivo() {
        Scanner sc = null;
        ligaFutbol = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    ligaFutbol.add(new Equipos(sc.next()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
