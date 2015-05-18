import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.abs;

/* Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um
triângulo. Em caso positivo, calcule o perímetro do triângulo e apresente a
mensagem:


Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como
altura, mostrando a mensagem


Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.
*/

/*
Definição: Para que se possa construir um triângulo é necessário que
a medida de QUALQUER um dos lados seja menor que a soma das medidas dos outros dois
e maior que o valor absoluto da diferença entre essas medidas. (Wikipedia)

|b - c| < a < b + c
*/

public class ex1043_triangulo {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		double A, B, C;

		A = input.nextDouble();
		B = input.nextDouble();
		C = input.nextDouble();

		if (((abs(B - C) < A) & (A < B + C)) & ((abs(A - C) < B) & (B < A + C)) & ((abs(A - B) < C) & (C < A + B))) {
			System.out.println("Perimetro = " + (A + B + C));
		}
		else {
			System.out.println("Area = " + (((A + B) * C)/2));
		}

    }
}