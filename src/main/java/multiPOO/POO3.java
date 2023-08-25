/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multiPOO;

public class POO3 {
    public static void main(String[] args){
        int s;//salario bruto
        double r;//retencion en la fuente
        double sn;//salario neto
        s=48*5000;
        r=s*0.125;
        sn=s-r;
        System.out.println("El salario bruto es: "+s);
        System.out.println("La rentencion en la fuente es: "+r);
        System.out.println("El salario neto es: "+sn);
    }
}
