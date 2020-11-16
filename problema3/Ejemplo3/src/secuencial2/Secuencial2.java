/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secuencial2;
import java.util.Scanner;
/**
 *
 * @author Nixon
 */
public class Secuencial2 {

    /**
     * @param args the command line arguments
     */
    public static void main (String[]args){
        Scanner teclado= new Scanner(System.in);
        double costo;
        int articulos;
        double precioUnitario;
        double descuento;
        int porcentaje=15;
        System.out.println ("Ingrese la cantidad que se requiere del artículo");
        articulos= teclado.nextInt();
        System.out.println ("Ingrese el precio unitario del articulo");
        precioUnitario= teclado.nextDouble();
        costo = precioUnitario * articulos;
        if (articulos >50 ){
            descuento = (costo *porcentaje)/100;
            costo  = costo  - descuento;
        }
        System.out.println ("El costo total del pedido del articulo es de: " 
                + costo);
    }
}