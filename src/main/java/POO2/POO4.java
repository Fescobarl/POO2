package POO2;
/*
Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita
es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es
amarilla un 25%, si es azul un
50% y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un
cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores
mencionados. 
 */
import java.util.Scanner;
public class POO4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el valor de la compra: ");
        int v = sc.nextInt();
        System.out.println("ingrese el color de la bolita obtenida(escrito en mayusculas): ");
        String b = sc.next();
        double d= 0;
        if(b.equals("BLANCO")){
            d = 0;
        }
        else if(b.equals("VERDE")){
            d = v*0.1;
        }
        else if(b.equals("AMARILLO")){
            d = v*0.25;
        }
        else if(b.equals("AZUL")){
            d = v*0.5;
        }
        else if(b.equals("ROJO")){
            d = v;
        }
        double total= v-d;
        System.out.println("El cliente debe pagar: " + total);
    }
}
