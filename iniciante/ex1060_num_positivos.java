import java.io.IOException;
import java.util.Scanner;

/* Faça um programa que leia 6 valores. Estes valores serão somente negativos
ou positivos (desconsidere os valores nulos). A seguir, mostre a quantidade de
valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.
*/
public class ex1060_num_positivos {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	double N;
    	int c=0;

    	for (int i=0; i<6; i++) {
    		N = input.nextDouble();
    		if (N > 0.0) {
    			c++;
    		}
    	}
    	System.out.println(c + " valores positivos");
    }
}