import java.io.IOException;
import java.util.Scanner;

/* Leia uma quantidade indeterminada de duplas de valores inteiros X e Y.
Escreva para cada X e Y uma mensagem que indique se estes valores foram
digitados em ordem crescente ou decrescente.

Entrada
A entrada contém vários casos de teste. Cada caso contém dois valores inteiros
X e Y. A leitura deve ser encerrada ao ser fornecido valores iguais para X e
Y.

Saída
Para cada caso de teste imprima “Crescente”, caso os valores tenham sido
digitados na ordem crescente, caso contrário imprima a mensagem “Decrescente”.
*/

public class ex1113_crescente_e_decrescente {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int x, y;

		do {
			x = input.nextInt();
			y = input.nextInt();
			if (x < y) {
				System.out.println("Crescente");
			}
			else if (x > y) {
				System.out.println("Decrescente");
			}
		} while (x != y);

    }
}
