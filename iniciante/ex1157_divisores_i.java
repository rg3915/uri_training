import java.util.Scanner;

/*
Ler um número inteiro N e calcular todos os seus divisores.

Entrada

O arquivo de entrada contém um valor inteiro.

Saída

Escreva todos os divisores de N, um valor por linha.
*/

public class ex1157_divisores_i {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n;
		n = input.nextInt();

		for (int i=1; i <= n/2; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}
		System.out.println(n);
    }
}
