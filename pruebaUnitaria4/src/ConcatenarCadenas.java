
public class ConcatenarCadenas {
    // Declara el método concatenar(), que concatena dos cadenas de texto.
    public static String concatenar(String cadena1, String cadena2) {
        //  Devuelve la concatenación de las cadenas cadena1 y cadena2.
        return cadena1 + cadena2;
    }

    public static void main(String[] args) {
        String cadena1 = "Hola, ";
        String cadena2 = "Mundo!";
        String resultado = concatenar(cadena1, cadena2);
        System.out.println("Resultado de la concatenación: " + resultado);
    }
}