import java.io.IOException;
import java.util.Scanner;

/* Faça um programa que leia 5 valores inteiros. Conte quantos destes valores
digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de
valores pares lidos. */

public class ex1065_pares_entre_cinco_numeros {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int N, c=0;

    	for (int i=0; i<5; i++) {
    		N = input.nextInt();
    		if (N % 2 == 0) {
    			c++;
    		}
    	}
    	System.out.println(c + " valores pares");
    }
}