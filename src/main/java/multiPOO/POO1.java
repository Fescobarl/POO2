package multiPOO;
import java.util.Scanner;
public class POO1 {
    /*ejercicio uno del ejercicio de seguimiento
    ejercicio numero 4 del libro de programacion logica
    */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Ejuan,Ealberto,Eana,Emama;
        System.out.println("ingrese la edad de Juan: ");
        Ejuan = sc.nextInt(); //Edad de Juan
        Ealberto = Ejuan *2/3; //Edad Alberto
        Eana = Ejuan * 4/3; //Edad Ana
        Emama = Ejuan+Ealberto+Eana; //Edad de la madre
        System.out.println("La edad de Juan es: "+Ejuan);
        System.out.println("La edad de Alberto es: "+Ealberto);
        System.out.println("La edad de Ana es: "+Eana);
        System.out.println("La edad de la madre es: "+Emama);
    }
}
