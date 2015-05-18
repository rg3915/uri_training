import java.util.Scanner;

/* Escreva um programa que leia um valor inteiro N. Este N é a quantidade de
linhas de saída que serão apresentadas na execução do programa.

Entrada

O arquivo de entrada contém um número inteiro positivo N.

Saída

Imprima a saída conforme o exemplo fornecido.
*/

public class ex1142_pum {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int N;
		N = input.nextInt();

		for (int i=1; i <= N*4; i+=4) {
			System.out.print(i + " ");
			System.out.print(i+1 + " ");
			System.out.print(i+2 + " ");
			System.out.println("PUM");
		}
    }
}
