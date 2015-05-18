import java.io.IOException;
import java.util.Scanner;

/*
https://projecteuler.net/

2520 é o menor número que pode ser dividido por cada um dos números de 1 a 10, sem qualquer restante.

O que é o menor número positivo que é divisível por todos os números de 1 a 20?
*/

public class project_euler_01 {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int n = 0, i;

		i = input.nextInt();

		while (n % i != 0) {
			n++;
			i--;
			System.out.println(n, i);
		}


// https://github.com/rg3915/playground/blob/master/uri/1165/1165.cpp

    }
}