import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Calcule o consumo médio de um automóvel sendo fornecidos a distância total
percorrida (em Km) e o total de combustível gasto (em litros).

Entrada
O arquivo de entrada contém dois valores: um valor inteiro X representando a
distância total percorrida (em Km) e um valor real Y representando o total de
combustível gasto, com um dígito após o ponto decimal.

Saída
Apresente o valor que representa o consumo médio do automóvel com 3 casas após
a vírgula, seguido da mensagem "km/l". */

public class ex1014_consumo {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		int X;
		double Y, consumo;

		X = input.nextInt();
		Y = input.nextDouble();

		consumo = X / Y;

		System.out.println(df.format(consumo) + " km/l");

    }
}