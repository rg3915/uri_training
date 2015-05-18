import java.io.IOException;
import java.util.Scanner;

/* Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram
positivos. Na próxima linha, deve-se mostrar a média de todos os valores
positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto
flutuante. Pelo menos um destes número será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha
deve mostrar a média dos valores positivos digitados. */

public class ex1064_positivos_media {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	double N, soma=0.0, media;
    	int c=0;

    	for (int i=0; i<6; i++) {
    		N = input.nextDouble();
    		if (N > 0.0) {
    			c++;
    			soma+=N;
    		}
    	}
    	media=soma/c;
    	System.out.println(c + " valores positivos");
    	System.out.println(media);
    }
}