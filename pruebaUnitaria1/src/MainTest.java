import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    // Prueba unitaria para el método sumar.
  @Test
    public void sumar() {
      // Llamamos al método sumar y comprobamos si el resultado es igual a 8.
      int resultado = Main.sumar(3, 5);
      assertEquals(8, resultado);
    }
}