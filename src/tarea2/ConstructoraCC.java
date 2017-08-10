package tarea2;

public class ConstructoraCC extends Constructora{
    
   private String nombre;

    public ConstructoraCC(String nombre) {
        this.nombre = nombre;
    }    
    

    @Override
    public Edificio construir(String nombre, String material, int cantPer, int cantPis) {
        return new CentroComercial(nombre, material, cantPer, cantPis);
    }
    
}
