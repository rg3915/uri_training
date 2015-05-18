import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
import static java.lang.Math.abs;

/* Faça um programa que leia três valores e apresente o maior dos três valores
lidos seguido da mensagem “eh o maior”. Utilize a fórmula:

MaiorAB = (a+b+abs(a-b))/2

Entrada
O arquivo de entrada contém três valores inteiros.

Saída
Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
*/

public class ex1013_maior {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		int a, b, c, MaiorAB;

		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();

		MaiorAB = (a + b + Math.abs(a - b)) / 2;
		MaiorAB = (MaiorAB + c + Math.abs(MaiorAB - c)) / 2;

		System.out.println(MaiorAB + " eh o maior");

    }
}