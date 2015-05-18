import java.io.IOException;
import java.util.Scanner;

/* Escreva um algoritmo que leia 2 números e imprima o resultado da divisão do
primeiro pelo segundo. Caso não for possível mostre a mensagem “divisao
impossivel” para os valores em questão.

Entrada
A entrada contém um número inteiro N. Este N será a quantidade de pares de
valores inteiros (X e Y) que serão lidos em seguida.

Saída
Para cada caso mostre o resultado da divisão com um dígito após o ponto
decimal, ou “divisao impossivel” caso não seja possível efetuar o cálculo.

Obs.: Cuide que a divisão entre dois inteiros em algumas linguagens como o C e C++ gera outro inteiro. Utilize cast :)
*/

public class ex1116_dividindo_x_por_y {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int N;
    	double X, Y;
		N = input.nextInt();

		for (int i=0; i<N; i++) {
			X = input.nextDouble();
			Y = input.nextDouble();
			if (Y == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.println(X/Y);
			}
		}

    }
}
