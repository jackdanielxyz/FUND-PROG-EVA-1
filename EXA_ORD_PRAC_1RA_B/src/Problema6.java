import java.util.Scanner;
import java.text.DecimalFormat;

public class Problema6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Variables de introducción de datos
        double velAn_ini;
        double velAn_fi;
        int t;
        double radio;

        //Variables de resultados
        double distAn;
        double distM;
        double velAnProm;
        double velMS;
        double aceAn;
        double aceMS2;
        double frecHz;

        //Introducción de datos
        System.out.println("Introduce la velocidad angular inicial (rad/s):");
        velAn_ini = input.nextDouble();
        System.out.println("Introduce la velocidad angular final (rad/s):");
        velAn_fi = input.nextDouble();
        System.out.println("Introduce el tiempo de rotación (s):");
        t = input.nextInt();
        System.out.println("Introduce el radio (m):");
        radio = input.nextDouble();

        //Operaciones
        distAn = (velAn_ini + velAn_fi) * t / 2;
        distM = radio * t * (velAn_fi - velAn_ini);
        velAnProm = (velAn_fi + velAn_ini) / 2;
        velMS = radio * (velAn_fi - velAn_ini);
        aceAn = (velAn_fi - velAn_ini) / t;
        aceMS2 = radio * (Math.pow(velAn_fi, 2) - Math.pow(velAn_ini, 2));
        frecHz = (velAn_ini + velAn_fi) / (2 * Math.PI);

        System.out.println("_______________________________________________________________");

        //Resultados
        DecimalFormat df = new DecimalFormat("#.0000");
        System.out.println("El desplazamiento angular es: " + df.format(distAn) + " radianes");
        System.out.println("El desplazamiento lineal es: " + df.format(distM) + " metros");
        System.out.println("La velocidad angular promedio es: " + df.format(velAnProm) + " radianes");
        System.out.println("La velocidad lineal es: " + df.format(velMS) + " m/s");
        System.out.println("La aceleración angular es: " + df.format(aceAn) + " rad/s²");
        System.out.println("La aceleración lineal es: " + df.format(aceMS2) + " m/s²");
        System.out.println("La frecuencia es " + df.format(frecHz) + " Hz");

    }

}