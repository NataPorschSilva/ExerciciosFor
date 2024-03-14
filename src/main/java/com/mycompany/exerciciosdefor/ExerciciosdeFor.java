
package com.mycompany.exerciciosdefor;

import java.util.Scanner;

public class ExerciciosdeFor {

    public static void main(String[] args) {
    
        Scanner teclado= new Scanner(System.in);
    
        int n = 0;
        int soma = 0; 
        n = teclado.nextInt();
       
        
        for (int i = 2; i <= n; i+=2){
            soma += i;
             System.out.println(i);
        }
        System.out.println("A soma dos números pares até " + n +"é:"+ soma);
    }
}