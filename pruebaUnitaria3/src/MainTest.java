import static org.junit.Assert.*;
import org.junit.Test;
public class MainTest {

    // Prueba unitaria para el método calcularArea.
@Test
public void testCalcularArea() {
    // Comprobamos si el área de un triángulo con base 5.0 y altura 3.0 es aproximadamente 7.5.
    assertEquals(7.5, Main.calcularArea(5.0, 3.0), 0.01);
    // Comprobamos si el área de un triángulo con base 6.0 y altura 4.0 es aproximadamente 12.0.
    assertEquals(12.0, Main.calcularArea(6.0, 4.0), 0.01);
}
}