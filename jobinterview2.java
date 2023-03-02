/*
 * 2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores 
anteriores (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde,
informado um número, ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número
informado pertence ou não a sequência.
 */

package com.mycompany.jobinterview2;
import java.util.Scanner;

/**
 *
 * @author Tadeu
 * tools: netbeans, chatgpt
 */
public class Jobinterview2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Enter a number to check if it's in the Fibonacci sequence: ");
        int num = scanner.nextInt();

        //inicio do ciclo
        int a = 0;
        int b = 1;
        int c = a + b;
        
        //verificação
        while (c <= num) {
            if (c == num) {
                System.out.println(num + " is in the Fibonacci sequence.");
                return;
            }
            
            //continuação & calculo repetitivo

            a = b;
            b = c;
            c = a + b;
        }
//falta de confirmação/lado de fora
        System.out.println(num + " is not in the Fibonacci sequence.");
    }

}
