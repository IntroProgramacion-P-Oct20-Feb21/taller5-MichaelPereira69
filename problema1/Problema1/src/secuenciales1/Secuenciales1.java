/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuenciales1;

import java.util.Scanner;
public class    Secuenciales1{
	public static void main (String[]args){
            Scanner teclado= new Scanner(System.in);
            double costoHora;
            int kilovatiosConsumidos;
            double costoTotal;
            int edadCliente;
            double descuento;
            int porcentaje=10;
            System.out.println ("Ingrese el valor de costo por kilovatio/hora");
            costoHora= teclado.nextInt();
            System.out.println ("Ingrese el número de kilovatios consumidos en el mes.");
            kilovatiosConsumidos= teclado.nextInt();
            System.out.println ("Cual es la edad del cliente?");
            edadCliente= teclado.nextInt();
            costoTotal = costoHora * kilovatiosConsumidos;
            if (edadCliente>65){
                descuento = (costoTotal*porcentaje)/100;
                costoTotal = costoTotal - descuento;
            }
            System.out.println ("El costo total es: " + costoTotal);
        }
}