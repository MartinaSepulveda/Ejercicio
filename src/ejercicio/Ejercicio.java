/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Para ingresar el nombre
        Scanner ingresarNom = new Scanner(System.in);
        String nombre;
        
        System.out.println("Digite su nombre");
        nombre = ingresarNom.nextLine();
        
        //Para inggresar el tipo de cliente
        Scanner tipoCli = new Scanner(System.in);
        int tipo;
        
        System.out.println("Digite el tipo de cliente (número): ");
        tipo = tipoCli.nextInt();
        
        //Para ingresar la cantidad de hojas
        Scanner cantidadH = new Scanner(System.in);
        float cantidad;
        
        System.out.println("Digite la cantidad de hojas a compraar");
        cantidad = cantidadH.nextFloat();
        
        //Para ingresar el precio por cada hoja
        Scanner precioH = new Scanner(System.in);
        float precio;
        
        System.out.println("Ingrese el precio por hoja");
        precio = precioH.nextFloat();
        
        //Variables para las operaciones
        float descuento;
        float subtotal;
        float total;
        
        //Se calcula el subtotal
        subtotal = cantidad * precio;
        
        //Se evalua la opciones sugun el tipo de cliente y se adigna el descuento según sea el caso
        switch (tipo){
            case 1:
                descuento = (float) (subtotal * 0.05);
                break;
            case 2:
                descuento = (float) (subtotal * 0.08);
                break;
            case 3:
                descuento = (float) (subtotal * 0.12);
                break;
            case 4:
                descuento = (float) (subtotal * 0.15);
                break;
            default:
                descuento = 0;
                break;
        }
        
        //Se calcula el total después de la validación del tipo de ususario y el calculo del descuento
        total = subtotal - descuento;
        
        //Se imprimen los datos solicitados
        System.out.println("\n");
        System.out.println("Su nombre es: " + nombre);
        System.out.println("El subtotal de su compra a pagar es de: " + subtotal);
        System.out.println("El total neto a pagar de su compra es de: " + total);
        System.out.println("Hasta pronto :)");
    }
  
}
