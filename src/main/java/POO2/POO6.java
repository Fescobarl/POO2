package POO2;
/*
Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación. 
 */
import java.util.Scanner;
public class POO6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el valor A de la ecuacion: ");
        int A=sc.nextInt();
        System.out.println("ingrese el valor B de la ecuacion: ");
        int B=sc.nextInt();
        System.out.println("ingrese el valor C de la ecuacion: ");
        int C=sc.nextInt();
        double d= Math.pow(B, 2) - (4*A*C);
        if (d==0){
            System.out.println("La unica solucion es "+((-B) - (4 * A * C)) / (2 * A));
        }
        else{
            System.out.println("Las posibles soluciones son: "+((-B) + Math.sqrt(Math.pow(B, 2) - (4 * A * C))) / (2 * A)+" y "+((-B) - Math.sqrt(Math.pow(B, 2) - (4 * A * C))) / (2 * A));
        }
            
    }
}
