import java.util.Scanner;

/* Escrever um programa que leia 2 valores X e Y e que imprima todos os
valores entre eles cujo resto da divisão dele por 5 for igual a 2 ou igual a 3.

Entrada
O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente
em ordem crescente.

Saída
Imprima todos os valores conforme exemplo abaixo, sempre em ordem crescente.
*/

public class ex1133_resto_da_divisao {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int x, y, a;
		x = input.nextInt();
		y= input.nextInt();

		if (x > y) {
			a=x;
			x=y;
			y=a;
		}

		for (int i = x + 1; i < y; i++) {
			if (i % 5 == 2 || i % 5 == 3) {
				System.out.println(i);
			}
		}
    }
}
