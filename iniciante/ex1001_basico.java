import java.io.IOException;
import java.util.Scanner;

/* Leia 2 valores inteiros e armazene-os nas variáveis A e B. Efetue a soma de
A e B atribuindo o seu resultado na variável X. Imprima X conforme exemplo
apresentado abaixo. Não apresente mensagem alguma além daquilo que está sendo
especificado e não esqueça de imprimir o fim de linha após o resultado, caso
contrário, você receberá "Presentation Error".

Entrada
A entrada contém 2 valores inteiros.

Saída
Imprima a variável X conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.
*/

public class ex1001 {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int A, B, X;

		A = input.nextInt();
		B = input.nextInt();

		X = A + B;
		System.out.println("X = " + X);

    }
}