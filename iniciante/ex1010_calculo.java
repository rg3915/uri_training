import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Neste problema deve-se ler o código de uma peça 1, o número de peças 1, o
valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2, o
valor unitário de cada peça 2 e calcula e mostra o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3
valores, respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando
de deixar um espaço após os dois pontos e um espaço após o $. O valor deverá
ser apresentado com 2 casas após o ponto. */

public class ex1010_calculo {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int CODIGO1, PECAS1;
		int CODIGO2, PECAS2;
		double VALOR1, VALOR2, VALOR;

		CODIGO1 = input.nextInt();
		PECAS1 = input.nextInt();
		VALOR1 = input.nextDouble();
		CODIGO2 = input.nextInt();
		PECAS2 = input.nextInt();
		VALOR2 = input.nextDouble();

		VALOR = PECAS1 * VALOR1 + PECAS2 * VALOR2;

		System.out.println("VALOR A PAGAR: R$ " + df.format(VALOR));

    }
}