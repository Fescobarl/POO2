package POO2;
/*
Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de
ellos. 
 */
import java.util.Scanner;
public class POO3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ingrese el primer numero: ");
        int a=sc.nextInt();
        System.out.println("ingrese el segundo numero: ");
        int b=sc.nextInt();
        System.out.println("ingrese el tercer numero: ");
        int c=sc.nextInt();
        int m;
        if (a>b && a>c){
            System.out.println("el numero mayor es: " + a);
        }
        else if (b>a && b>c){
            System.out.println("el numero mayor es: " + b);
        }
        else if (c>a && c>b) {
            System.out.println("el numero mayor es: " + c);
        }
    }
}
