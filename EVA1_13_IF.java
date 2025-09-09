/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_13_if;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA1_13_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declarar el Scanner
        Scanner input = new Scanner(System.in);
        //Variable de la edad
        int edad;
        
        //Este es el que detecta la edad
        System.out.println("Introduce tu edad");
        edad = input.nextInt();
        System.out.println("Introduce tu nacimiento");
        
        //Variable if
        if (edad >= 18){
            System.out.println("Puede comprar bebidas alcoholicas");
            
        }else{
            System.out.println("No puede comprar bebidas alcoholicas");
        }
        
    }
    
}
