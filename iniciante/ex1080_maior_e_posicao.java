import java.io.IOException;
import java.util.Scanner;

/*
Leia 100 valores inteiros. Apresente então o maior valor lido e a posição dentre os 100 valores lidos.

Entrada

O arquivo de entrada contém 100 números inteiros, positivos e distintos.

Saída

Apresente o maior valor lido e a posição de entrada, conforme exemplo abaixo.
*/

public class ex1080_maior_e_posicao {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int N, maior, posicao=0;

    	maior = Integer.MIN_VALUE;

		for (int i=1; i<=100; i++) {
			N = input.nextInt();
			if (N > maior) {
				maior = N;
				posicao=i;
			}
		}
		System.out.println(maior);
		System.out.println(posicao);
    }
}
