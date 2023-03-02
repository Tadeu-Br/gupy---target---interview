/*prob arremessado:
*1) Observe o trecho de código abaixo:
*
*int INDICE = 13, SOMA = 0, K = 0;
*
*enquanto K < INDICE faça
*
*{
*
*K = K + 1;
*
*SOMA = SOMA + K;
*
*}
*
*imprimir(SOMA);
*
*
*
*Ao final do processamento, qual será o valor da variável SOMA?
*
*/
//resposta:

package com.mycompany.jobinterview1;

/**
 *
 * @author Tadeu
 * softwares: NetBeans + ChatGPT
 */
public class Jobinterview1 {

    public static void main(String[] args) {
int INDICE = 13;
int SOMA = 0;
int K = 0;

while (K < INDICE) {
    K = K + 1;
    SOMA = SOMA + K;
}

System.out.println(SOMA + " resultado");
    }
}
//output: 91 resultado
