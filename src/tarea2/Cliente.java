package tarea2;

public class Cliente {

    public static void main(String[] args) {
        
        Constructora ConsCR = new ConstructoraCR("Amarilo");
        Edificio CR = ConsCR.construir("plaza central", "madera", 500, 4);
        Constructora ConsCC = new ConstructoraCC("Capital");
        Edificio CC=ConsCC.construir("Hayuelos", "Marmol", 1500, 3);
        Constructora ConsH = new ConstructoraH("San Rafael");
        Edificio H = ConsH.construir("San Rafael", "Concreto", 1000, 5);
        System.out.println(CR.autoLimpieza());
        System.out.println(CR.prenderLuces());
        System.out.println(CC.autoLimpieza());
        System.out.println(CC.prenderLuces());
        System.out.println(H.autoLimpieza());
        System.out.println(H.prenderLuces());
        
    }
    
}
