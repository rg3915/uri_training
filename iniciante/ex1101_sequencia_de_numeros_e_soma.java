import java.io.IOException;
import java.util.Scanner;

/* Leia um conjunto não determinado de pares de valores M e N (parar quando
algum dos valores for menor ou igual a zero). Para cada par lido, mostre a
sequência do menor até o maior e a soma dos inteiros consecutivos entre eles
(incluindo o N e M).

Entrada
O arquivo de entrada contém um número não determinado de valores M e N. A
última linha de entrada vai conter um número nulo ou negativo.

Saída
Para cada dupla de valores, imprima a sequência do menor até o maior e a soma
deles, conforme exemplo abaixo.

CONTEM ERROS
*/

public class ex1101_sequencia_de_numeros_e_soma {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int M=100, N=100, soma=0;
		
		while ((M > 0) && (N > 0)) {
			M = input.nextInt();
			N = input.nextInt();
			soma=0;
			if (M < N) {
				for (int i=M; i<=N; i++) {
					System.out.print(i + " ");
					soma+=i;
				}
				System.out.println("Sum=" + soma);
			}
			else {
				for (int i=N; i<=M; i++) {
					System.out.print(i + " ");
					soma+=i;
				}
				System.out.println("Sum=" + soma);
			}
		}
    }
}
