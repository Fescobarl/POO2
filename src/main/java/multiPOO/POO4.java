/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiPOO;
import java.util.Scanner;
public class POO4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        double x=sc.nextDouble();//numero recibido
        double s=Math.pow(x, 2);//cuadrado
        double c=Math.pow(x, 3);//cubo
        System.out.println("El cuadrado del numero es: "+s);
        System.out.println("El cubo del numero es: "+c);
    }
}
