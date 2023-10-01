import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema5 {
    /*
    Construir un programa que permita conocer a que distancia caerá un objeto disparado con un cañón,
    el cual tiene un ángulo de 45o:
        • Solicitar al usuario la velocidad inicial en m/s.
        • Mostrar al usuario:
            o La altura máxima
            o La distancia que alcanza el objeto al caer.
     */
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");

        System.out.println("Introduce la velocidad inicial en m/s: ");
        double iVel = input.nextDouble();

        double altura = (Math.pow(iVel, 2) * Math.pow(Math.sin(Math.toRadians(45)), 2)) / (2 * 9.807);
        double distancia = (Math.pow(iVel, 2) * Math.sin(Math.toRadians(90))) / 9.807;

        System.out.println("""
                Altura Máxima: %s m
                Distancia: %s m""".formatted(df.format(altura), df.format(distancia)));
    }
}
