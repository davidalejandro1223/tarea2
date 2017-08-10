package tarea2;

public class ConstructoraCR extends Constructora{
    
    private String nombre;

    public ConstructoraCR(String nombre) {
        this.nombre = nombre;
    }
    

    @Override
    public Edificio construir(String nombre, String material, int cantPer, int cantPis) {
        return new ConjuntoResidencial(nombre, material, cantPer, cantPis);
    }
    
}
