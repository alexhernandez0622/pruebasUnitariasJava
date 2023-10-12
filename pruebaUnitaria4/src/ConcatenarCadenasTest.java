import org.junit.Test;

import static org.junit.Assert.*;

public class ConcatenarCadenasTest {

    @Test
    public void concatenar()
    {
        // Crea una nueva instancia de la clase Concatenar.
        ConcatenarCadenas concatenar = new ConcatenarCadenas();
        //  Declara la variable resultadoEsperado, que contiene el resultado esperado de la concatenación.
        String resultadoEsperado = "Holamundo";
        // : Llama al método concatenar() con las cadenas "Hola" y "mundo" como argumentos.
        String resultadoObtenido = concatenar.concatenar("Hola", "mundo");
        // Compara el resultado esperado con el resultado obtenido. Si los dos resultados son iguales, la prueba pasa.
        assertEquals(resultadoEsperado, resultadoObtenido);
    }
}