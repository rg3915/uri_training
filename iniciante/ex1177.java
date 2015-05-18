/* Faça um programa que leia um valor T e preencha um vetor N[1000] com a
sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo.
Imprima o vetor N.

Entrada

A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

Saída

Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e
x é o valor armazenado naquela posição. 

Entrada: 3

Saida:

N[0] = 0
N[1] = 1
N[2] = 2
N[3] = 0
N[4] = 1
N[5] = 2
N[6] = 0
N[7] = 1
N[8] = 2
*/

import java.util.Scanner;

public class ex1177 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n, i, j=0;

        n=input.nextInt();

        int v[] = new int[1000];

        for (i=0; i < 1000; i++) {
            if (j >= n) {
                j=0;
            }
            v[i] = j;
            System.out.println("N[" + i + "] = " + v[i]);
            j++;
        }
    }
}