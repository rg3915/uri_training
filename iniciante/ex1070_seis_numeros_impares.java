import java.io.IOException;
import java.util.Scanner;

/* Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares
consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.
*/

public class ex1070_seis_numeros_impares {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int X;
		X = input.nextInt();

		for (int i=X; i<X+12; i++) {
			if (i % 2 == 1) {
				System.out.println(i);
			}
		}
    }
}
