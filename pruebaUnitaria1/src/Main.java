
/*Realiza una prueba unitaria para una suma de dos números*/
public class Main {
    // Método que suma dos números enteros y devuelve el resultado.
    public static int sumar(int a, int b) {
        return a + b;
    }

    // Método principal para ejecutar el programa.
    public static void main(String[] args) {
        // Llamamos al método sumar y almacenamos el resultado.
        int resultado = sumar(3, 5);
        // Imprimimos el resultado en la consola.
        System.out.println("Resultado de la suma: " + resultado);
    }
}