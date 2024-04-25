/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herrada.millicay.cravero.pkg5tob;

import java.util.Scanner;

/**
 *
 * @author PC02
 */
public class Tp_1 {
    public static void main(String[] args) {
        System.out.println("Ingrese un numero entero");
        Scanner teclado= new Scanner (System.in);
        String num=teclado.nextLine();
        for (int i=0;i<num.length();i++){
            char caracter= num.charAt(i);
           System.out.println("Digitos: "+caracter);
           if (caracter%2==0)
               System.out.println("Es par");
           else
                System.out.println("Es impar");

     }

        
       


    }
    
}
