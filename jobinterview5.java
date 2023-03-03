/*
5) Escreva um programa que inverta os caracteres de um string.

IMPORTANTE:

a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;

b) Evite usar funções prontas, como, por exemplo, reverse;


*/

package com.mycompany.jobinterview5;
import java.util.Scanner;
/**
 *
 * @author Tadeu
 * tools: netbeans, chatgpt
 */
public class Jobinterview5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Coloque algo: ");
        String original = input.nextLine();

        char[] chars = original.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }

        String reversed = new String(chars);
        System.out.println("Palavra invertida: " + reversed);
    }
}
