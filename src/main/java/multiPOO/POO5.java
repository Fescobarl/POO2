/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiPOO;
import java.util.Scanner;
public class POO5 {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("ingrese un numero (radio de un circulo): ");
    int r=sc.nextInt();
    double area=(Math.PI)*(Math.pow(r, 2));
    double perimetro=Math.PI*r;
    System.out.println("El area del circulo es: "+ area);
    System.out.println("La longitud de la circunferencia es: "+perimetro);
}
}    
