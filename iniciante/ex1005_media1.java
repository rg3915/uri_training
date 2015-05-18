import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem
a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota
A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11).
Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Calcule e imprima a variável MEDIA conforme exemplo abaixo, com 5 dígitos após
o ponto decimal e com um espaço em branco antes e depois da igualdade. Utilize
variáveis de dupla precisão (double) e como todos os problemas, não esqueça de
imprimir o fim de linha após o resultado, caso contrário, você receberá
"Presentation Error". */

public class ex1005 {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00000");
		double A, B, MEDIA;

		A = input.nextDouble();
		B = input.nextDouble();

		MEDIA = (A*3.5 + B*7.5)/11;
		System.out.println("MEDIA = " + df.format(MEDIA));

    }
}