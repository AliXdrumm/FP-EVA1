/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_captura;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA1_10_Captura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Aquí cree el scanner
        Scanner captu = new Scanner(System.in);
        //Aqui lo que hice fue nombrar a las variables
        double Velocidad, Distancia, Tiempo;
        
        //Conversiones
          System.out.println("Introduce la distancia");
          Distancia = captu.nextDouble();
          System.out.println("Introduce el tiempo");
          Tiempo = captu.nextDouble();
          
          //Calculo
          Velocidad = Distancia / Tiempo;
          
          //Realización
         System.out.println("La velocidad fué: ");
         System.out.println(Velocidad);
         System.out.println("m/s");
    }
    
}
