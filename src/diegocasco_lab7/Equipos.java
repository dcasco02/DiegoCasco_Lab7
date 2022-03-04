/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diegocasco_lab7;

/**
 *
 * @author dcasc
 */
public class Equipos {
    private String Nombreequipo;
    private int partidosjugados;
    private int partidosganados;
    private int partidosempatados;
    private int partidosperdidos;
    private int golesfavor;
    private int golescontra;
    private int golesdieferencia;
    private int puntos;

    public Equipos(String Nombreequipo) {
        this.Nombreequipo = Nombreequipo;
    }
    
    public String getNombreequipo() {
        return Nombreequipo;
    }

    public void setNombreequipo(String Nombreequipo) {
        this.Nombreequipo = Nombreequipo;
    }

    public int getPartidosjugados() {
        return partidosjugados;
    }

    public void setPartidosjugados(int partidosjugados) {
        this.partidosjugados = partidosjugados;
    }

    public int getPartidosganados() {
        return partidosganados;
    }

    public void setPartidosganados(int partidosganados) {
        this.partidosganados = partidosganados;
    }

    public int getPartidosempatados() {
        return partidosempatados;
    }

    public void setPartidosempatados(int partidosempatados) {
        this.partidosempatados = partidosempatados;
    }

    public int getPartidosperdidos() {
        return partidosperdidos;
    }

    public void setPartidosperdidos(int partidosperdidos) {
        this.partidosperdidos = partidosperdidos;
    }

    public int getGolesfavor() {
        return golesfavor;
    }

    public void setGolesfavor(int golesfavor) {
        this.golesfavor = golesfavor;
    }

    public int getGolescontra() {
        return golescontra;
    }

    public void setGolescontra(int golescontra) {
        this.golescontra = golescontra;
    }

    public int getGolesdieferencia() {
        return golesdieferencia;
    }

    public void setGolesdieferencia(int golesdieferencia) {
        this.golesdieferencia = golesdieferencia;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    @Override
    public String toString() {
        return Nombreequipo;
    }
    
}
