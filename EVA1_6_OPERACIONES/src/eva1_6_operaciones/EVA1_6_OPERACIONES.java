/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_6_operaciones;

/**
 *
 * @author licce
 */
public class EVA1_6_OPERACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double pi;
        double radio;
        double area; //Solo cuando son variables del mismo tipo
        // Es lo mismo que double pi, radio, area;
        //Inicialización
        pi = 3.1416;
        radio = 10;
        //OPERACION:
        area = pi * radio *radio;
        //SALIDA DE LOS DATOS:
        System.out.println("El area de un circulo de radio=10 es:");
        System.out.println(area);
    }
    
}
