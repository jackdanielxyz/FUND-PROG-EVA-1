import java.text.DecimalFormat;
import java.util.Scanner;
public class Problema2 {
    /*
    Construir un programa que permita obtener la conversión entre diferentes escalas de temperatura.
    Investigar las fórmulas:
        • La temperatura se capturará desde el teclado y será en grados Fahrenheit.
        • Mostrar el equivalente en grados centígrados y Kelvin.
        • Deberá realizar la petición de los datos al usuario de la mejor manera,
          indicando que le pide y en que unidad de medida.
        • Deberá mostrar los resultados indicando claramente a que unidad de medida corresponden.
     */
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce la tempreatura en grados Fahrenheit (˚F): ");
        double fahGrados = input.nextDouble();

        convertirCelsius(fahGrados);
    }
    public static void convertirCelsius (double T){
        /*
        La formula para convertir de ˚F a ˚C es:
        (°F − 32) × 5/9 = °C
         */
        DecimalFormat df = new DecimalFormat("#,###.##");
        double celGrados = (T - 32.0) * (5.0/9.0);

        System.out.println("La temperatura en grados Celsius es: " + df.format(celGrados) + "˚C");
    }

}