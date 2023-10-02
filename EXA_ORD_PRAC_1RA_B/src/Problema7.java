import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema7 {
    /*
    Dada la fórmula 𝑦 = 𝑥2, hacer un programa que permita:
        • Conocer el valor de la pendiente para cualquier valor de x que el usuario quiera.
        • Conocer el valor del área entre dos valores de x proporcionados por el usuario.
        • En ambos casos, debe preguntar al usuario e indicarle que valores debe introducir.

     */
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");

        System.out.println("Introduce un valor para x: ");
        double xP = input.nextDouble();

        System.out.println("Introduce valor inicial: ");
        double xV1 = input.nextDouble();

        System.out.println("Introduce valor final: ");
        double xV2 = input.nextDouble();

        double pendiente = xP * 2;
        double area = (Math.pow(xV2, 3) - Math.pow(xV1, 3)) / 3;

        System.out.println("""
                Pendiente: %s
                Area entre los valores: %s""".formatted(df.format(pendiente), df.format(area)));

    }

}
