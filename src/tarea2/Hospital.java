package tarea2;

public class Hospital extends Edificio {
    
    private String nombre;
    private String materialConstr;
    private int capacidadPer;
    private int cantPisos;

    public Hospital(String nombre, String materialConstr, int capacidadPer, int cantPisos) {
        this.nombre = nombre;
        this.materialConstr = materialConstr;
        this.capacidadPer = capacidadPer;
        this.cantPisos = cantPisos;
    }
    
    
    
    @Override
    public String prenderLuces() {
        return "se han prendido las luces del hospital";
    }

    @Override
    public String autoLimpieza() {
        return "Se ha empezado el sistema de auto limpieza";
    }
    
}
