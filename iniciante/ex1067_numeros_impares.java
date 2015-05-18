import java.io.IOException;
import java.util.Scanner;

/* Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
até X, um valor por linha, inclusive o X, se for o caso.

Entrada
O arquivo de entrada contém 1 valor inteiro qualquer.

Saída
Imprima todos os valores ímpares de 1 até X, inclusive X, se for o caso.
*/

public class ex1067_numeros_impares {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int X;
		X = input.nextInt();

		for (int i=1; i<=X; i+=2) {
			System.out.println(i);
		}
    }
}
