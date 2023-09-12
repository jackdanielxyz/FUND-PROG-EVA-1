/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva1_6_entradas_salidas;

/**
 *
 * @author jackdaniel
 */

import java.util.*;
import java.lang.Math;
public class EVA1_6_ENTRADAS_SALIDAS {
    private static Scanner captura = new Scanner(System.in);
    public static void main(String[] args) {
        
        //Declaración de variables
        String marca;
        String modelo;
        int precio;
        int anio;

        //Asignación de variables
        System.out.println("¿Qué marca es tu carro?");
        marca = captura.nextLine();

        System.out.println("¿Qué modelo es?");
        modelo = captura.nextLine();

        System.out.println("¿De qué año es?");
        anio = captura.nextint();

        System.out.println("¿Cuánto costó?");
        precio = captura.nextDouble();

        //Muestra de datos al usuario
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Precio: " + precio);

        //Fin
    }
}
