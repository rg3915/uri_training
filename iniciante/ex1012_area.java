import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Escreva um programa que leia três valores com ponto flutuante de dupla
precisão: A, B e C. Em seguida, calcule e mostre:
a) a área do triângulo
retângulo que tem A por base e C por altura.
b) a área do círculo de raio C.
(pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a
uma das áreas descritas acima, sempre com mensagem correspondente e um espaço
entre os dois pontos e o valor. O valor calculado deve ser apresentado com 3
dígitos após o ponto decimal. */

public class ex1012_area {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.000");
		double A, B, C, pi;
		double TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO;

		pi = 3.14159;
		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		TRIANGULO = A * C * 0.5;
		CIRCULO = pi * C * C;
		TRAPEZIO = (A + B) * C * 0.5;
		QUADRADO = B * B;
		RETANGULO = A * B;
		System.out.println("TRIANGULO: " + df.format(TRIANGULO));
		System.out.println("CIRCULO: " + df.format(CIRCULO));
		System.out.println("TRAPEZIO: " + df.format(TRAPEZIO));
		System.out.println("QUADRADO: " + df.format(QUADRADO));
		System.out.println("RETANGULO: " + df.format(RETANGULO));

    }
}