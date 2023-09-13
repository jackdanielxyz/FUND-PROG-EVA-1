/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1_9_area_triangulo;

import java.util.*;
import java.lang.Math;
import java.util.Scanner;

public class EVA1_9_AREA_TRIANGULO {

   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      
      //variable assignment
      double base;
      double altura;
      double area;
      
      System.out.println("Introduce base: ");
      base = input.nextDouble();
      System.out.println("Introduce altura: ");
      altura = input.nextDouble();
      
      area = (base * altura)/2;
      
      System.out.println("El Area es: " + area);
   }
   
}
