import java.io.IOException;
import java.util.Scanner;

/* Leia um valor inteiro N que é a quantidade de casos de teste que vem a
seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve
apresentar a soma de todos os ímpares existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de
teste que vem a seguir. Cada caso de teste consiste em uma linha contendo dois
inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y. */

public class ex1099_soma_de_impares_consecutivos {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int i, j, N, X, Y, soma;
		N = input.nextInt();

		for (j=0; j<N; j++) {
			X = input.nextInt();
			Y = input.nextInt();
			soma=0;
			if (X < Y) {
				for (i=X+1; i<Y; i++) {
					if (i % 2 != 0) {
						soma+=i;
					}
				}
			}
			else {
				for (i=Y+1; i<X; i++) {
					if (i % 2 != 0) {
						soma+=i;
					}
				}
			}
		System.out.println(soma);
		}
    }
}
