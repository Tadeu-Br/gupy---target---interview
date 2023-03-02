/*
 * 
4 - Dois veículos (um carro e um caminhão) 
saem respectivamente de cidades opostas pela mesma rodovia. O carro de Ribeirão Preto em
direção a Franca, a uma velocidade constante de 110 km/h e o caminhão de Franca
em direção a Ribeirão Preto a uma velocidade constante de 80 km/h. 
Quando eles se cruzarem na rodovia, qual estará mais próximo a cidade de Ribeirão Preto?



IMPORTANTE:

a) Considerar a distância de 100km entre a cidade de Ribeirão Preto <-> Franca.

b) Considerar 2 pedágios como obstáculo e que o caminhão leva 5 minutos a mais para passar em cada um deles e o carro possui tag de pedágio (Sem Parar)

c) Explique como chegou no resultado.

*/

package com.mycompany.jobinterview4;

/**
 *
 * @author Tadeu
 * tools: netbeans, chatgpt
 */
public class Jobinterview4 {

    public static void main(String[] args) {
        double distancia = 100.0; // Distancia entre Ribeirão Preto e Franca em km
        double distanciapedagio = distancia / 3.0; // Distancia em cada pedágio em km

        double tempoCarro = (distancia - distanciapedagio) / 110.0; // Tempo levado por carro
        double tempoCaminhao = (distancia - distanciapedagio) / 80.0; // Tempo levado por caminhão
        tempoCaminhao += 0.0833 * 2; // Mais 5 minutos pra cada parte do caminhão
         
        double distanciaCarro = tempoCarro * 110.0; // Distancia viajada de carro em km.
        double distanciaCaminhao = tempoCaminhao * 80.0; // Distanc viajada por caminhão em km.
        
        double distanciaCarroDeRibeirao = distanciaCarro; // Distancia entre carro e ribeirão
        double distanciaCaminhaoDeRibeirao = distancia - distanciaCaminhao; // Distancia entre caminhão e ribeirão

        if (distanciaCarroDeRibeirao > distanciaCaminhaoDeRibeirao) {
            System.out.println("O caminhão está mais perto de Ribeirão Preto.");
        } else if (distanciaCarroDeRibeirao < distanciaCaminhaoDeRibeirao) {
            System.out.println("O carro está mais perto de Ribeirão Preto.");
        } else {
            System.out.println("Ambos veiculos tem a mesma distancia em ribeirão preto..");
        }
    }
}
