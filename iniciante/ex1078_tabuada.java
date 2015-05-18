import java.io.IOException;
import java.util.Scanner;

/*
Leia 1 valor inteiro N (2 < N < 1000). A seguir, mostre a tabuada de N:      
1 x N = N      2 x N = 2N        ...       10 x N = 10N

Entrada

A entrada contém um valor inteiro N (2 < N < 1000).

Saída

Imprima a tabuada de N, conforme o exemplo fornecido.
*/

public class ex1078_tabuada {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int N;
		N = input.nextInt();

		for (int i=1; i<=10; i++) {
			System.out.println(i + " x " + N + " = " + i*N);
		}
    }
}
