/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication21;

import java.util.*;

/**
 *
 * @author Estudiante
 */

public class JavaApplication21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner flujoentrada = new Scanner(System.in);
        //Declaración de variables
        String nombre = null;
        int numerohoras;
        double valorhora;

        System.out.println("Nombre");
        nombre = flujoentrada.next();

        System.out.println("Horas");
        numerohoras = flujoentrada.nextInt();

        System.out.println("Valor");
        valorhora = flujoentrada.nextDouble();

        System.out.println(calcularSalario(numerohoras, valorhora));
    }

    public static double calcularSalario(int horas, double valor) {
        double totalsalario;
        if ((horas > 40) && (horas <= 48)) {
            totalsalario = (40 * valor) + ((horas - 40) * 2 * valor);
        } else if (horas > 48) {
            totalsalario = (40 * valor) + ((8) * 2 * valor) + ((horas - 48) * 3 * valor);
        } else {
            totalsalario = valor * horas;
        }
        return totalsalario;
    }
}
