
package POO2;

/*
Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
perímetro, el valor de la altura y el área del triángulo. 
*/

import java.util.Scanner;
public class POO1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el lado de su triangulo");
        int l = sc.nextInt();
        int p = l*3;
        double h = (Math.sqrt(3)*l)/2;
        double a = (l*h)/2;
        System.out.println("El perimetro del triangulo es: " + p);
        System.out.println("La altura del triangulo es: " + h);
        System.out.println("El area del triangulo es: " + a);
    }    
}
