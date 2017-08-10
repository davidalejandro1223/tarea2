package tarea2;

public class ConstructoraH extends Constructora{
    
    private String nombre;

    public ConstructoraH(String nombre) {
        this.nombre = nombre;
    }
    
    
    @Override
    public Edificio construir(String nombre, String material, int cantPer, int cantPis) {
        return new Hospital(nombre, material, cantPer, cantPis);
    }
    
}
