/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_11_operaciones.lógicas;

/**
 *
 * @author licce
 */
public class EVA1_11_OperacionesLógicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Radio = 5;
        //Declaramos eh inicializamos a la vez, se puede
        boolean resu;
        //Operaciones lógicas (comparar)
        //Resultados: Verdadero o falso
        resu = Radio > 0; //Radio es mayor que cero
        System.out.println("Radio (5) > 0 -->");
         System.out.println(resu);//Radio mayor a cero?
         
        resu = Radio < 0;//Radio menor que cero?
        System.out.println("Radio (5) > 0 -->");
         System.out.println(resu);
         
         resu = Radio == 0;//Radio igual a cero?
         System.out.println("Radio (5) = 0 -->");
         System.out.println(resu);
         
         resu = Radio != 0;//Radio es diferente a cero?
         System.out.println("Radio (5) != 0 -->");
         System.out.println(resu);
    }
    
}
