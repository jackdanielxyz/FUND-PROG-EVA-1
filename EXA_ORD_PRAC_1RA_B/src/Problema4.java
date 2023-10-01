import java.text.DecimalFormat;
import java.util.Scanner;

public class Problema4 {
    /*
    Construir un programa para calcular los datos de un circuito eléctrico,
    se tomarán en cuenta 5 resistencias conectadas en paralelo:
        • Capturar los valores de las resistencias desde el teclado.
        • Capturar el voltaje.
        • Mostrar al usuario:
            o Resistencia equivalente
            o Intensidad de corriente
            o Intensidad de la corriente en cada resistencia
     */
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.##");

        System.out.println("Introduce Resistencia 1: ");
        double r1 = input.nextDouble();

        System.out.println("Introduce Resistencia 2: ");
        double r2 = input.nextDouble();

        System.out.println("Introduce Resistencia 3: ");
        double r3 = input.nextDouble();

        System.out.println("Introduce Resistencia 4: ");
        double r4 = input.nextDouble();

        System.out.println("Introduce Resistencia 5: ");
        double r5 = input.nextDouble();

        System.out.println("Introduce Voltaje: ");
        double volt = input.nextDouble();

        double resEq = res_Eq(r1,r2,r3,r4,r5);
        double intCo = volt/resEq;
        double intCo_Ind1 = volt/r1;
        double intCo_Ind2 = volt/r2;
        double intCo_Ind3 = volt/r3;
        double intCo_Ind4 = volt/r4;
        double intCo_Ind5 = volt/r5;

        System.out.println("La resistencia equivalente es: %s Ohmios".formatted(df.format(resEq)));
        System.out.println("La intensidad de corriente es: %s Amperios".formatted(df.format(intCo)));
        System.out.println("""
                La intensidad de corriente en cada resistencia es:
                Resistencia 1: %s
                Resistencia 2: %s
                Resistencia 3: %s
                Resistencia 4: %s
                Resistencia 5: %s""".formatted(df.format(r1), df.format(r2),
                df.format(r3), df.format(r4), df.format(r5)));

    }
    public static double res_Eq (double r1, double r2, double r3, double r4, double r5){
        double sumRes1 = (r1 * r2)/(r1 + r2);
        double sumRes2 = (sumRes1 * r3)/(sumRes1 + r3);
        double sumRes3 = (sumRes2 * r4)/(sumRes2 + r4);
        double sumRes4 = (sumRes3 * r5)/(sumRes3 + r5);

        return sumRes4;

    }
}
