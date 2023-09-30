import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema3 {
    /*
    Construir un programa que permita calcular el número de metros cúbicos de agua que fluyen por una tubería:
        • Solicitar al usuario el radio de la tubería.
        • Solicitar la velocidad del flujo de agua en m/s.
        • Mostrar la cantidad de m^≤3 que fluyen por la tubería.
     */
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Introduce el radio de la tubería: ");
        double rTuberia = input.nextDouble();
        System.out.println("Introduce el el flujo de agua en m/s: ");
        double vAgua = input.nextDouble();

        flujoAgua(rTuberia, vAgua);
    }
    public static void flujoAgua (double rT, double vA){
        DecimalFormat df = new DecimalFormat("#,###.##");

        double pi = 3.14159;
        double x = vA * (pi * Math.pow(rT, 2));

        System.out.println("El total agua que fluye por la tuberia es: " + df.format(x) + " m^3");

    }
}
