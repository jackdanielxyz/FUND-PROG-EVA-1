import java.util.Scanner;

public class Problema8 {
    /*
    Utilizando una de las dos fórmulas canónicas de la hipérbola (seleccione cualquiera de las dos, vertical u horizontal):
        • Solicite al usuario los datos de la fórmula (centro y divisores)
        • De como resultado:
            o Distancia del centro al foco.
            o Las coordenadas de los vértices. o Las coordenadas de los focos.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese la coordenada x del centro de la elipse: ");
        double centroX = input.nextDouble();

        System.out.print("Ingrese la coordenada y del centro de la elipse: ");
        double centroY = input.nextDouble();

        System.out.print("Ingrese el divisor mayor (semieje a): ");
        double a = input.nextDouble();

        System.out.print("Ingrese el divisor menor (semieje b): ");
        double b = input.nextDouble();

        double c = Math.sqrt((a * a) + (b * b));

        double[] vertX = {centroX - a, centroX + a};
        double[] vertY = {centroY, centroY};

        double foco1X = centroX + c;
        double foco1Y = centroY;
        double foco2X = centroX - c;
        double foco2Y = centroY;

        System.out.println("Distancia del centro al foco (c): " + c);
        System.out.println("Coordenadas de los vértices: (" + vertX[0] + ", " + vertY[0] + ") y" +
                " (" + vertX[1] + ", " + vertY[1] + ")");
        System.out.println("Coordenadas de los focos: (" + foco1X + ", " + foco1Y + ") y" +
                " (" + foco2X + ", " + foco2Y + ")");

    }
}
