import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BatmanTest {
    private Batman batman1;
    private Batman batman2;
    private Batman batman3;
    private Batman batman4;

    @BeforeEach
    void setUp() {
        batman1 = new Batman("Krypton", "Ingles", 1600);
        batman2 = new Batman("Gotham", "Español", 1200);
        batman3 = new Batman("Metropolis", "Ingles", 300);
        batman4 = new Batman("Gotham", "Español", 1200);
    }

    @Test
    void testEsKryngo() {
        assertTrue(batman1.esKryngo(), "Batman1 debería ser un infiltrado.");
        assertFalse(batman2.esKryngo(), "Batman2 no debería ser un infiltrado.");
    }

    @Test
    void testSeNecesitaUnTraductor() {
        List<Batman> listaDeBatmans1 = new ArrayList<>();
        listaDeBatmans1.add(batman1);
        listaDeBatmans1.add(batman2);
        listaDeBatmans1.add(batman3);

        assertTrue(batman1.seNecesitaUnTraductor(listaDeBatmans1), "Debería necesitarse un traductor.");

        List<Batman> listaDeBatmans2 = new ArrayList<>();
        listaDeBatmans2.add(batman2);

        assertFalse(batman1.seNecesitaUnTraductor(listaDeBatmans2), "No debería necesitarse un traductor.");
    }

    @Test
    void testIrALaPanaderia() {
        batman4.irALaPanaderia();
        assertEquals(1206, batman4.facturasConsumidas, "Batman4 debería tener 1206 facturas después de ir a la panadería.");
    }

    @Test
    void testAltosNiveles() {
        List<Batman> listaDeBatmans3 = new ArrayList<>();
        listaDeBatmans3.add(batman1);
        listaDeBatmans3.add(batman2);

        List<Batman> resultado = batman1.altosNiveles(listaDeBatmans3);
        assertEquals(1, resultado.size(), "Debería haber 1 Batman con altos niveles de facturas.");
        assertTrue(resultado.contains(batman1), "Batman1 debería estar en la lista de altos niveles.");
    }
}