/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2;

/**
 *
 * @author Estudiantes
 */
public class ConjuntoResidencial extends Edificio{
    
    private String nombre;
    private String materialConstr;
    private int capacidadPer;
    private int cantPisos;

    public ConjuntoResidencial(String nombre, String materialConstr, int capacidadPer, int cantPisos) {
        this.nombre = nombre;
        this.materialConstr = materialConstr;
        this.capacidadPer = capacidadPer;
        this.cantPisos = cantPisos;
    }
    

    @Override
    public String prenderLuces() {
        return "Se han prendido las luces del conjunto residencial";
    }

    @Override
    public String autoLimpieza() {
        return "Se ha empezado la auto limpieza";
    }
    
}
