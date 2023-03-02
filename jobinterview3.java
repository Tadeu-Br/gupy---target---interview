/*
 * 
3) Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, ___

b) 2, 4, 8, 16, 32, 64, ____

c) 0, 1, 4, 9, 16, 25, 36, ____

d) 4, 16, 36, 64, ____

e) 1, 1, 2, 3, 5, 8, ____

f) 2,10, 12, 16, 17, 18, 19, ____
 */

package com.mycompany.jobinterview;
import java.util.Scanner;

/**
 *
 * @author Tadeu
 * tools: netbeans, chatgpt
 */
public class Jobinterview {

    public static void main(String[] args) {

        int prevNum;
         int nextNum;
         int pos;
         int prevNum1;
         int prevNum2;
 //perg. 1:
 prevNum = 7;
 nextNum = prevNum + 2;
System.out.println("resposta 1 " + nextNum); // Output: 9
//perg 2
 prevNum = 64;
 nextNum = prevNum * 2;
System.out.println("resposta 2 " + nextNum); // Output: 128
//perg 3
 prevNum = 36;
 pos = 7; // Position of the next number in the sequence
 nextNum = pos * pos;
System.out.println("resposta 3 " + nextNum); // Output: 49

//perg 4
 prevNum = 64;
 nextNum = prevNum + 20;
System.out.println("resposta 4 " + nextNum); // Output: 84

//perg 5
 prevNum1 = 5;
 prevNum2 = 8;
 nextNum = prevNum1 + prevNum2;
System.out.println("resposta 5 " + nextNum); // Output: 13

//perg 6
 prevNum = 19;
 nextNum = prevNum + 2;
System.out.println("resposta 6 " + nextNum); // Output: 21


    }

}
