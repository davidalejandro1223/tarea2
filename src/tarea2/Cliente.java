package tarea2;

public class Cliente {

    public static void main(String[] args) {
        
        Constructora ConsCR = new ConstructoraCR("Amarilo");
        Edificio CR = ConsCR.construir("plaza central", "madera", 500, 4);
        System.out.println(CR.autoLimpieza());
        System.out.println(CR.prenderLuces());
        
    }
    
}
