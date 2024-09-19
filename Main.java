import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Batman batman1 = new Batman("Krypton", "Ingles", 1600);
        Batman batman2 = new Batman("Gotham", "Español", 1200);
        Batman batman3 = new Batman("Gotham", "Ingles", 300);
        //Falta resolver algunas cosas
        List<Batman> listaDeBatmans = new ArrayList<>();
        listaDeBatmans.add(batman1);
        listaDeBatmans.add(batman2);
        listaDeBatmans.add(batman3);

        System.out.println("¿Batman1 es un infiltrado? " + batman1.esKryngo());
        System.out.println("¿Batman3 es un infiltrado? " + batman3.esKryngo());

        System.out.println("¿Se necesita un traductor? " + batman2.seNecesitaUnTraductor(listaDeBatmans));
        System.out.println("¿Se necesita un traductor? " + batman3.seNecesitaUnTraductor(listaDeBatmans));

        batman2.irALaPanaderia();
        System.out.println("Batman2 ha consumido " + batman2.facturasConsumidas + " facturas después de ir a la panadería.");

        List<Batman> batmansConAltosNiveles = batman1.altosNiveles(listaDeBatmans);
        System.out.println("Número de Batman con altos niveles de facturas: " + batmansConAltosNiveles.size());
    }
}
