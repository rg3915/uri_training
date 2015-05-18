import java.io.IOException;
import java.util.Scanner;

/* Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram
pares, quantos valores digitados foram ímpares, quantos valores digitados
foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não
esquecendo o final de linha após cada uma. */

public class ex1066_pares_impares_positivos_negativos {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int N, par=0, impar=0, positivo=0, negativo=0;

    	for (int i=0; i<5; i++) {
    		N = input.nextInt();
    		if (N % 2 == 0) {
    			par++;
    		}
    		else {
    			impar++;
    		}
    		if (N > 0) {
    			positivo++;
    		}
    		if (N < 0) {
    			negativo++;
    		}
    	}
    	System.out.println(par + " valor(es) par(es)");
    	System.out.println(impar + " valor(es) impar(es)");
    	System.out.println(positivo + " valor(es) positivo(s)");
    	System.out.println(negativo + " valor(es) negativo(s)");
    }
}
