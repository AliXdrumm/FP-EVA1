/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_12_if;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA1_12_If {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int califa;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Introduce tu calificación");
        califa = captu.nextInt();
        //Bloque verdadero if
        if (califa >= 70){
        System.out.println("ACREDITAS");
        //Bloque falso else
        }else{
         System.out.println("NO ACREDITAS");
        }
        
    }
    
}
