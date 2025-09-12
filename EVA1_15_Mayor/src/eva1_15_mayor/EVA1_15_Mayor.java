/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_mayor;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA1_15_Mayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Incluyo el Scanner para detectar el número
        Scanner input = new Scanner(System.in);
        
        //Incluyo las variables
        int num1, num2;
        
        //Declaro las variables
        System.out.println("Introduce un numero");
        num1 = input.nextInt();
        
        System.out.println("Introduce otro número");
        num2 = input.nextInt();
        
        //Aplicamos el if
        if (num1 > num2){
        System.out.println("El valor mayor es: ");
        System.out.println(num1);
        }else{
        if (num2 > num1){
                System.out.println("El valor mayor es: ");
                System.out.println(num2);
        }else{
            System.out.println("Los valores son iguales");
        }
        }
        
        
    }
    
}
