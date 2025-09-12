/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_acceso;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA1_18_Acceso {
    //CONSTANTES: Identificadores que no pueden cambiar de valor
     final static String USUARIO = "Alan";
     final static String PWD = "1234";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        String usu, contr;
        System.out.println("***********BIENVENIDO**********");
        System.out.println("Sistema de extraccion de información de la UTCh");
        
        System.out.println("Introduzca el usuario");
        usu = input.nextLine();
        System.out.println("Introduce la contraseña: ");
        contr = input.nextLine();
        
        if(usu.equals(USUARIO)){
          if (contr.equals(PWD)){
             System.out.println("ACCESO CONCEDIDO!!");
          }else{
              System.out.println("ACCESO DENEGADO");
          }
          }else{
           System.out.println("ACCESO DENEGADO");
        }
        }
    }
