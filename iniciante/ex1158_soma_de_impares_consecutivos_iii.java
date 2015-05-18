import java.util.Scanner;

/* Leia um valor inteiro N que é a quantidade de casos de teste que vem a
seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve
apresentar a soma de Y ímpares consecutivos a partir de X inclusive o próprio
X se ele for ímpar. Por exemplo: para a entrada 4 5, a saída deve ser 45, que
é equivalente à: 5 + 7 + 9 + 11 + 13 para a entrada 7 4, a saída deve ser 40,
que é equivalente à: 7 + 9 + 11 + 13

Entrada

A primeira linha de entrada é um inteiro N que é a quantidade de casos de
teste que vem a seguir. Cada caso de teste consiste em uma linha contendo dois
inteiros X e Y.

Saída

Imprima a soma dos consecutivos números ímpares a partir do valor X.

Entrada

2
4 3
11 2

Saida

21
24
*/

public class ex1158_soma_de_impares_consecutivos_iii {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n, x, y, s, i;
		n = input.nextInt();

		while (n>=0) {
			s=0;
			x = input.nextInt();
			y = input.nextInt();
			if (x % 2 == 0) {
				x++;
			}
			for (i=0; i<y; i++, x+=2) {
				s+=x;
			}
			System.out.println(s);
			n--;
		}
    }
}
