/* Faça um programa que leia um vetor N[20]. Troque a seguir, o primeiro
elemento com o último, o segundo elemento com o penúltimo, etc., até trocar o
10º com o 11º. Mostre o vetor modificado.

Entrada

A entrada contém 20 valores inteiros, positivos ou negativos.

Saída

Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor
e Y é o valor armazenado naquela posição. */

import java.util.Scanner;

public class ex1175 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int x, i;
    	int v[] = new int[20];

        for (i=0; i <= 19; i++) {
            // v[i] = input.nextInt();
            v[i]=i+1;
        }

        for (i=0; i <= 19; i++) {
            x = v[i];
            v[i] = v[19-i];
            v[19-i] = x;
        }

        for (i=0; i <= 19; i++) {
            System.out.println("N[" + i + "] = " + v[i]);
        }
    }
}