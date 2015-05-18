import java.io.IOException;
import java.util.Scanner;

public class vetores02 {
    public static void main(String[] args) throws IOException {

    	Scanner input = new Scanner(System.in);
    	int numero[] = new int[10];
    	int i=0, contador=0, n;
    	double soma=0.0, media=0.0;
    	int menor = Integer.MAX_VALUE;
    	int maior = Integer.MIN_VALUE;

    	/* numero[0] = 4;
    	numero[1] = 8;
    	numero[2] = 10;
    	numero[3] = 14;
    	numero[4] = -2;
    	numero[5] = 500;
    	numero[6] = 30;
    	numero[7] = 600;
    	numero[8] = 120;
    	numero[9] = 100; */

    	System.out.print("Informe quantos numeros voce quer calcular: ");
    	n = input.nextInt();

    	// preencher o vetor
    	while (i < n) {
    		numero[i] = input.nextInt();
    		// calcular a soma
    		soma += numero[i];
	    	// maior valor do vetor
	    	if (numero[i] > maior) {
	    		maior = numero[i];
	    	}
	    	// menor valor do vetor
	    	if (numero[i] < menor) {
	    		menor = numero[i];
	    	}
    		i++;
    	}

    	// calcular a media
    	media = soma/i;
    	System.out.println("Media: " + media);

    	// verificar quantos sao maiores que a media
    	i=0;
    	while (i <= 9) {
    		if (numero[i] > media) {
    			contador++;
    		}
    		i++;
    	}

    	// Qtde. numeros maior que media
    	System.out.println("Qtde. numeros maior que media: " + contador);

    	System.out.println("Maior valor do vetor: " + maior);
    	System.out.println("Menor valor do vetor: " + menor);

	}
}