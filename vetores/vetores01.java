import java.io.IOException;
import java.util.Scanner;

/* Considere o problema de cálculo das médias:
O que queremos agora é ler uma sequência de
números (10, 20 ou até 100), ou seja, 1 ou
vários números, calcular a média dos números
lidos, e por fim saber quantos números são
maiores que média. Como podemos fazer
isso ? */

public class vetores01 {
    public static void main(String[] args) throws IOException {

    	Scanner input = new Scanner(System.in);
    	int numero[] = new int[10];
    	int i=0, soma=0, contador=0;
    	double media=0.0;

    	numero[0] = 4;
    	numero[1] = 8;
    	numero[2] = 10;
    	numero[3] = 14;
    	numero[4] = 4;
    	numero[5] = 500;
    	numero[6] = 30;
    	numero[7] = 60;
    	numero[8] = 120;
    	numero[9] = 100;

    	// preencher o vetor
    	while (i <= 9) {
    		// numero[i] = input.nextInt();
    		soma += numero[i]; // calcular a soma
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

    	System.out.println("Qtde. numeros maior que media: " + contador);


	}
}