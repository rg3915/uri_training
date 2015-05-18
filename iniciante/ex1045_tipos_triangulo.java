import java.io.IOException;
import java.util.Scanner;

/*
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente,
de modo que o lado A representa o maior dos 3 lados.
A seguir, determine o tipo de triângulo que estes três lados formam, 
com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

* se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
* se A² = B² + C², apresente a mensagem: TRIANGULO RETANGULO
* se A² > B² + C², apresente a mensagem: TRIANGULO OBTUSANGULO
* se A² < B² + C², apresente a mensagem: TRIANGULO ACUTANGULO
* se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
* se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES

Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.
*/

public class ex1045_tipos_triangulo {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		double A, B, C, A2, B2, C2;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		A2 = A*A;
		B2 = B*B;
		C2 = C*C;

		if (A >= (B + C)) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if ((A2) == (B2 + C2)) {
			System.out.println("TRIANGULO RETANGULO");
		}
		else if ((A2) > (B2 + C2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		else if ((A2) < (B2 + C2)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		else if ((A == B) & (B == C)) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		else if ((B == C)) {
			System.out.println("TRIANGULO ISOSCELES");
		}
// EXERCICIO INCOMPLETO - FALHANDO
    }
}