import java.io.IOException;
import java.util.Scanner;

/* A seguinte sequência de números 0 1 1 2 3 5 8 13 21... é conhecida como
série de Fibonacci. Nessa sequência, cada número, depois dos 2 primeiros, é
igual à soma dos 2 anteriores. Escreva um algoritmo que leia um inteiro N (N <
46) e mostre os N primeiros números dessa série.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 46).

Saída
Os valores devem ser mostrados na mesma linha, separados por um espaço em
branco. Não deve haver espaço após o último valor. */

public class ex1151_fibonacci {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int n, fib = 1, num = 0;

		n = input.nextInt();

		System.out.print(0);
		System.out.print(" " + 1);
		while (n > 2) {
			fib = fib + num;
			num = fib - num;
			System.out.print(" " + fib);
			n -= 1;
		}
		System.out.println("\n");
    }
}