import java.io.IOException;
import java.util.Scanner;

/* Leia um valor inteiro N. Apresente o quadrado de cada um dos valores pares,
de 1 até N, inclusive N, se for o caso.

Entrada
A entrada contém um valor inteiro N (5 < N < 2000).

Saída
Imprima o quadrado de cada um dos valores pares, de 1 até N, conforme o
exemplo abaixo.

Tome cuidado! Algumas linguagens tem por padrão apresentarem como saída 1e+006
ao invés de 1000000 o que ocasionará resposta errada. Neste caso, configure a
precisão adequadamente para que isso não ocorra. */

public class ex1073_quadrado_de_pares {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int N;
		N = input.nextInt();

		for (int i=2; i<=N; i+=2) {
			System.out.println(i + "^2 = " + i*i);
		}
    }
}
