import java.util.Scanner;
public class Secuenciales3{
    public static void main (String[]args){
        Scanner teclado= new Scanner(System.in);
	int dias1=5;
        int dias2=10;
        int dias3=15;
        int diasHospedaje;
        int porcentaje;
        double precioHabitacion;
        double subtotal;
        double pagoTotal;
        double descuento;
        double pagoTotal1;
        double descuento1;
	System.out.println ("Ingrese el numero de dias que se va a hospedar");
	diasHospedaje= teclado.nextInt();
        System.out.println ("Ingrese el precio unitario de la habitacion");
	precioHabitacion= teclado.nextDouble();
        subtotal =(diasHospedaje * precioHabitacion);
	if (diasHospedaje>dias1){
            porcentaje=10;
            descuento = (porcentaje * precioHabitacion /100);
            pagoTotal  = subtotal - descuento;
                if (diasHospedaje>dias2){
                    porcentaje=15;
                    descuento=0;
                    pagoTotal=0;
                    descuento = (porcentaje * precioHabitacion /100);
                    pagoTotal  = subtotal - descuento;
                        if (diasHospedaje>dias3){
                            descuento=0;
                            pagoTotal=0;
                            porcentaje=20;
                            descuento = (porcentaje * precioHabitacion /100);
                            pagoTotal  = subtotal - descuento;
        System.out.println("El subtotal a pagar es: "+subtotal +", el descuento"
                + " es: " +descuento +" y el total a pagar es: " + pagoTotal);
                        }
                }
                
        }else{
            System.out.println("El total a pagar es: "+subtotal);
        }
    }
}
