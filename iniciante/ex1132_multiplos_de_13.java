import java.util.Scanner;

/* Escrever um algoritmo que leia 2 valores inteiros X e Y calcule a soma dos
números que não são múltiplos de 13 entre X e Y, incluindo ambos.

Entrada

O arquivo de entrada contém 2 valores inteiros quaisquer, não necessariamente
em ordem crescente.

Saída

Imprima a soma de todos os valores não divisíveis por 13 entre os dois valores
lidos na entrada, inclusive ambos se for o caso. */

public class ex1132_multiplos_de_13 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int x, y, i, s = 0;
		x = input.nextInt();
		y = input.nextInt();

		if (x < y) {
			for (i = x; i <= y; i++) {
				if (i % 13 != 0) {
					s += i;
				}
			}
		} else {
			for (i = y; i <= x; i++) {
				if (i % 13 != 0) {
					s += i;
				}
			}
		}
		System.out.println(s);
    }
}
