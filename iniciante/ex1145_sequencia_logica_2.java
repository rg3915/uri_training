import java.util.Scanner;

/* Escreva um programa que leia dois valores X e Y. A seguir, mostre uma
sequência de 1 até Y, passando para a próxima linha a cada X números.

Entrada
O arquivo de entrada contém dois valores inteiros, (1 < X < 20) e (X < Y < 100000).

Saída
Cada sequência deve ser impressa em uma linha apenas, com 1 espaço em branco
entre cada número, conforme exemplo abaixo.

Entrada
3 99

Saida
1 2 3
4 5 6
7 8 9
10 11 12
...
97 98 99
*/

public class ex1145_sequencia_logica_2 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int x, y, i, j;
		x = input.nextInt();
		y = input.nextInt();
		i=1;
		while (i <= y) {
			for (j=0; j<x; j++) {
				if (i>y) {
					break;
				}
				if (j == 0) {
					System.out.print(i++ + " ");
				} else {
					System.out.print(i++ + " ");
				}
			}
			System.out.println("");
		}
    }
}
