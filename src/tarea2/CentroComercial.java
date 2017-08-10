package tarea2;

public class CentroComercial extends Edificio {
    
    private String nombre;
    private String materialConstr;
    private int capacidadPer;
    private int cantPisos;

    public CentroComercial(String nombre, String materialConstr, int capacidadPer, int cantPisos) {
        this.nombre = nombre;
        this.materialConstr = materialConstr;
        this.capacidadPer = capacidadPer;
        this.cantPisos = cantPisos;
    }
    
    
    
    @Override
    public String prenderLuces() {
        return "Se han prendido las luces del centro comercial";
    }

    @Override
    public String autoLimpieza() {
        return "se ha comenzado la auto limpieza";
    }
    
}
