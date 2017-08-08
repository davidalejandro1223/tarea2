package tarea2;


public abstract class Edificio {
    
    private String nombre;
    private String materialConstr;
    private int capacidadPer;
    private int cantPisos;
    
    abstract String prenderLuces();
    abstract String autoLimpieza();
}
