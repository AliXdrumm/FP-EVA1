/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_descuento;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA1_14_Descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro scanner
        Scanner input = new Scanner(System.in);
        
        //Declaro las variables
        double monto;
        double precio;
        //Analiza el monto
        System.out.println("Introduce el monto a pagar:");
        monto = input.nextInt();
        
        //Ecuación con el monto
        if (monto > 1000){
        precio = monto - (monto * 0.15);
        System.out.println("El monto a pagar es: ");
        System.out.print(precio);
        }
        else{
        System.out.println("No hay descuento, el monto a pagar es: ");
        System.out.println(monto);
    }
    }
    
}
