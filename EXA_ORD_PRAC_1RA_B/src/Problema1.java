public class Problema1 {
    /*
    Construir un programa que imprima en pantalla los siguientes datos del equipo:
        • Nombre del equipo.
        • Nombre del proyecto final.
        • Nombre de cada integrante del equipo (apellidos, nombre, número de control)
    Cada dato a imprimir deberá estar almacenado en su propia variable, dicha variable debe estar
    inicializada con los datos solicitados y luego usar la variable para imprimir la información.
    Se debe mostrar en pantalla un mensaje indicando que se imprime, ejemplo:
        Nombre del equipo: Apple Pie
     */
    public static void main (String[] args){
        String nEquipo = "Froyo\n";
        String nPFinal = "Password Manager\n";
        String nInteg = """
                Daniel Eduardo Perez Jaquez
                Raul Eduardo Ornelas Munoz
                Roberto Jair Guzman Chairez
                Noel Fernando Aguilar Chaparro""";

        System.out.println("Nombre de Equipo: " + nEquipo + "Proyecto: " +
                            nPFinal + "Integrantes: " + nInteg);

    }
}
