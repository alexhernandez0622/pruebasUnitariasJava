import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    // Prueba unitaria para el método esPar.
    @Test
    public void esPar() {
        // Comprobamos si el número 6 es par.
        assertTrue(EsPar.esPar(6));
        // Comprobamos si el número 7 no es par.
        assertFalse(EsPar.esPar(7));
    }
}