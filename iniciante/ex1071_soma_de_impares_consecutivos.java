import java.io.IOException;
import java.util.Scanner;

/* Leia 2 valores inteiros X e Y. A seguir, calcule e mostre a soma dos
números impares entre eles.

Entrada
O arquivo de entrada contém dois valores inteiros.

Saída
O programa deve imprimir um valor inteiro. Este valor é a soma dos valores
ímpares que estão entre os valores fornecidos na entrada que deverá caber em
um inteiro. */

public class ex1071_soma_de_impares_consecutivos {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int i, X, Y, soma=0;
		X = input.nextInt();
		Y = input.nextInt();

		if (X < Y) {
			for (i=X+1; i<Y; i++) {
				if (i % 2 != 0) {
					soma+=i;
				}
			}
		}
		else {
			for (i=Y+1; i<X; i++) {
				if (i % 2 != 0) {
					soma+=i;
				}
			}
		}

		System.out.println(soma);
    }
}
