/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_captura;

import java.util.Scanner;

/**
 *
 * @author licce
 */
public class EVA1_9_Captura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre;
        int edad;
        double promedio;
        Scanner input = new Scanner(System.in);//Crear el scaner
        
        
        System.out.println("Introduce tu nombre completo");
        //CAPTURA DE DATOS:
        nombre = input.nextLine();//Todo lo que captura el texto
        System.out.println("Introduce tu edad");
        edad = input.nextInt();
        System.out.println("Introduce tu promedio de la preparatoria");
        promedio = input.nextDouble();
        
        
        System.out.println("El nombre es: ");
        System.out.println(nombre);
        System.out.println("Tu edad es: ");
        System.out.println(edad);
        System.out.println("Tu promedio fué de: ");
        System.out.println(promedio);
    }
    
}
