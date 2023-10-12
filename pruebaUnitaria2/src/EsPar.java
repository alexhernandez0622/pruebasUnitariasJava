// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,

/*Prueba Unitaria para verificar si un número es par*/
public class EsPar {
    // Método que verifica si un número es par.
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    // Método principal para ejecutar el programa.
    public static void main(String[] args) {
        // Definimos un número y llamamos al método esPar para verificar si es par.
        int numero = 6;
        if (esPar(numero)) {
            System.out.println(numero + " es par.");
        } else {
            System.out.println(numero + " no es par.");
        }

    }
}