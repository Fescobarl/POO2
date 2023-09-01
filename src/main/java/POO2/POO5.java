package POO2;

/*
Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor
o menor peso. 
 */
import java.util.Scanner;
public class POO5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A");
        int A=sc.nextInt();
        System.out.println("Ingrese el peso de la esfera B");
        int B=sc.nextInt();
        System.out.println("Ingrese el peso de la esfera C");
        int C=sc.nextInt();
        System.out.println("Ingrese el peso de la esfera D");
        int D=sc.nextInt();
        if(A!=B&&A!=C&&A!=D){
            if(A>B){
                System.out.println("A es la bola diferente y tiene un mayor peso");
            }
            else{
                System.out.println("A es la bola diferente y tiene un menor peso");
            }
        }
        else if(B!=A&&B!=C&&B!=D){
            if(B>A){
                System.out.println("B es la bola diferente y tiene un mayor peso");
            }
            else{
                System.out.println("B es la bola diferente y tiene un menor peso");
            }
        }
        else if(C!=B&&C!=A&&C!=D){
            if(C>B){
                System.out.println("C es la bola diferente y tiene un mayor peso");
            }
            else{
                System.out.println("C es la bola diferente y tiene un menor peso");
            }
        }
        else if(D!=B&&D!=C&&D!=A){
            if(D>B){
                System.out.println("D es la bola diferente y tiene un mayor peso");
            }
            else{
                System.out.println("D es la bola diferente y tiene un menor peso");
            }
        }
    }
}
