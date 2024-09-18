import java.util.List;
import java.util.ArrayList;

public class Batman {
    String dni;
    String idioma;
    int facturasConsumidas;

    public Batman(String dni, String idioma, int facturasConsumidas) {
        this.dni = dni;
        this.idioma = idioma;
        this.facturasConsumidas = facturasConsumidas;
    }

    public boolean esKryngo() {
        if (this.dni.equals("Krypton") && this.idioma.equals("Ingles")) {
            System.out.println("Es un infiltrado");
            return true;
        }
        return false;
    }

    public boolean seNecesitaUnTraductor(List<Batman> listaDeBatmans) {
        for (Batman batman : listaDeBatmans) {
            if (batman.idioma.equals("Ingles")) {
                return true;
            }
        }
        return false;
    }

    public void irALaPanaderia() {
        this.facturasConsumidas += 6;
    }

    public List<Batman> altosNiveles(List<Batman> listaDeBatmans) {
        List<Batman> batmansConAltosNiveles = new ArrayList<>();
        for (Batman batman : listaDeBatmans) {
            // Si el Batman ha consumido más de 1500 facturas, añadir a la lista
            if (batman.facturasConsumidas > 1500) {
                batmansConAltosNiveles.add(batman);
            }
        }
        return batmansConAltosNiveles;
    }
}
