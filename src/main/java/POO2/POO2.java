
package POO2;
/*
Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo
si A es mayor, menor o igual a B
 */
import java.util.Scanner;
public class POO2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba el primer valor: ");
        int A=sc.nextInt();
        System.out.println("Escriba el segundo valor: ");
        int B=sc.nextInt();
        if (A>B){
            System.out.println("A es mayor que B");
        }
        else if (A<B){
            System.out.println("A es menor que B");
        }
        else if (A==B){
            System.out.println("A y B son iguales");
        }
    }
}
