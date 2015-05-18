import java.io.IOException;
import java.util.Scanner;

/*
Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e
atribua esta operação à variável PROD. A seguir mostre a variável PROD
com mensagem correspondente.   

Entrada
O arquivo de entrada contém 2 valores inteiros.

Saída
Imprima a variável PROD conforme exemplo abaixo, com um espaço em branco antes
e depois da igualdade. Não esqueça o fim de linha após o produto,
caso contrário seu programa apresentará a mensagem: “Presentation Error”.
*/

public class ex1004 {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int a, b, PROD;

		a = input.nextInt();
		b = input.nextInt();

		PROD = a * b;
		System.out.println("PROD = " + PROD);

    }
}