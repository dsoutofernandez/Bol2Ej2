
package bol2ej1;

import java.util.Scanner;

public class Bol2Ej1 {

    public static void main(String[] args) {

        System.out.println("Introduzca la base: ");
        Scanner base = new Scanner (System.in);
        
        int lado = 0;
        int area = 0;
        
        lado = base.nextInt();
        
        area = lado * lado;
        
        System.out.println(area);
        
    }
    
}
