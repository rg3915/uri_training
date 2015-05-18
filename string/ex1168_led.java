import java.io.IOException;
import java.util.Scanner;

/* João quer montar um painel de leds contendo diversos números. Ele não
possui muitos leds, e não tem certeza se conseguirá montar o número desejado.
Considerando a configuração dos leds dos números abaixo, faça um algoritmo que
ajude João a descobrir a quantidade de leds necessário para montar o valor.

Entrada
A entrada contém um inteiro N, (1 ≤ N ≤ 1000) correspondente ao número
de casos de teste, seguido de N linhas, cada linha contendo um número (1 ≤ V ≤
10100) correspondente ao valor que João quer montar com os leds.

Saída
Para cada caso de teste, imprima uma linha contendo o número de leds que João
precisa para montar o valor desejado, seguido da palavra "leds". */

public class ex1168_led {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N, i, k, tamanho, soma;
        N = input.nextInt();
        String palavra;
        i = 0;
        while(i < N){
            palavra = input.next();
            i++;
            tamanho = palavra.length();
            k = 0;
            soma = 0;
            while(k < tamanho){
                
		char c = palavra.charAt(k);
		int z = Character.getNumericValue(c);
		if (z == 1) {
			soma = soma + 2;
		}
		else if ((z == 2) | (z == 3) | (z == 5)) {
			soma = soma + 5;
		}
		else if (z == 4) {
			soma = soma + 4;
		}
		else if ((z == 6) | (z == 9) | (z == 0)) {
			soma = soma + 6;
		}
		else if (z == 7) {
			soma = soma + 3;
		}
		else if (z == 8) {
			soma = soma + 7;
		}
                k++;
            }
            System.out.println(soma + " leds");
        }
    }
}