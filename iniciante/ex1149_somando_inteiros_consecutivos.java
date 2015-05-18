import java.util.Scanner;

/* Faça um algoritmo para ler um valor A e um valor N. Imprimir a soma dos N
números a partir de A(inclusive). Enquanto N for negativo ou ZERO, um novo
N(apenas N) deve ser lido.

Entrada
A entrada contém somente valores inteiros, podendo ser positivos ou negativos.
Todos os valores estão na mesma linha.

Saída
A saída contém apenas um valor inteiro.
*/

public class ex1149_somando_inteiros_consecutivos {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int a, b, s;
		a = input.nextInt();
		s=a;
		b = input.nextInt();

		while (b <= 0) {
			b = input.nextInt();
		}
		for (int i=1; i<b; i++) {
			s = s + 1 + a;
		}
		System.out.println(s);

    }
}
