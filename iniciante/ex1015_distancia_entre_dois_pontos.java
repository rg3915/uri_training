import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.Math.pow;

/* Leia os quatro valores correspondentes aos eixos x e y de dois pontos
quaisquer no plano, p1(x1,y1) e p2(x2,y2) e calcule a distância entre eles,
mostrando 4 casas decimais após a vírgula, segundo a fórmula:

Distancia = sqrt{(x2 - x1)^2 + (y2 - y1)^2}

Entrada
O arquivo de entrada contém duas linhas de dados. A primeira linha contém dois
valores de ponto flutuante: x1 y1 e a segunda linha contém dois valores de
ponto flutuante x2 y2.

Saída
Calcule e imprima o valor da distância segundo a fórmula fornecida, com 4
casas após o ponto decimal. */

public class ex1015_distancia_entre_dois_pontos {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		double x1, y1, x2, y2, distancia;

		x1 = input.nextDouble();
		y1 = input.nextDouble();
		x2 = input.nextDouble();
		y2 = input.nextDouble();

		distancia = Math.pow(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2),0.5);

		System.out.println(df.format(distancia));

    }
}