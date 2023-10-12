
/*Realizar una prueba unitaria para verificar el área de un triangulo*/
public class Main {
    // Método que calcula el área de un triángulo con la fórmula base * altura / 2.
    public static double calcularArea(double base, double altura) {
        return 0.5 * base * altura;
    }

    // Método principal para ejecutar el programa.
    public static void main(String[] args) {
        // Definimos la base y la altura del triángulo y calculamos el área.
        double base = 5.0;
        double altura = 3.0;
        double area = calcularArea(base, altura);
        // Imprimimos el área en la consola.
        System.out.println("Área del triángulo: " + area);
    }
}