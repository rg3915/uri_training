import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Leia 1 valor inteiro N, que representa o número de casos de teste que vem a
seguir. Cada caso de teste consiste de 3 valores reais, cada um deles com uma
casa decimal. Apresente a média ponderada para cada um destes conjuntos de 3
valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o
terceiro valor tem peso 5.

Entrada
O arquivo de entrada contém um valor inteiro N na primeira linha. Cada N linha
a seguir contém um caso de teste com três valores com uma casa decimal cada
valor.

Saída
Para cada caso de teste, imprima a média ponderada dos 3 valores, conforme
exemplo abaixo. */

public class ex1079_medias_ponderadas {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	DecimalFormat df = new DecimalFormat("0.0");
    	int N;
    	double p1, p2, p3, media;
		N = input.nextInt();

		for (int i=0; i<N; i++) {
			p1 = input.nextDouble();
			p2 = input.nextDouble();
			p3 = input.nextDouble();
			media = (2*p1 + 3*p2 + 5*p3)/10;
			System.out.println(df.format(media));
		}
    }
}
