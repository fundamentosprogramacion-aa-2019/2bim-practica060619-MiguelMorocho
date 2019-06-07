/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejo_de_arreglos;

import java.util.Scanner;

/**
 *
 * @author Miguel 
 */
public class Manejo_de_Arreglos {

    public static void main(String[] args) {
        // TODO code application logic here
        int[] valores = new int[4];
        Scanner entrada = new Scanner(System.in);

        System.out.println(valores[3]);
        valores[1 + 1] = 35;
        valores[2] = 35;
        // error <- valores [4] = 25;
        for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
        for (int i = 0; i < valores.length; i++) {
            System.out.printf("Ingrese el valor de la posición: %d\n", i);
            valores [i] = entrada.nextInt();
        }
       for (int i = 0; i < valores.length; i++) {
            System.out.println(valores[i]);
        }
    }
}
