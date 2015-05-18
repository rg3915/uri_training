import java.util.Scanner;

/* Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a
quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.

1 1 1
2 4 8
3 9 27
4 16 64
5 25 125
*/

public class ex1143_quadrado_e_ao_cubo {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n, i;
		n = input.nextInt();

		for (i=1; i <= n; i++) {
			System.out.print(i + " ");
			System.out.print(i*i + " ");
			System.out.println(i*i*i);
		}
    }
}
