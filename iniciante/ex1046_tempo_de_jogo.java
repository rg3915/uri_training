import java.io.IOException;
import java.util.Scanner;

/* Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração
do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro, tendo
uma duração máxima de 24 horas.

Entrada
Dois números inteiros representando o início e o fim do jogo.

Saída
Mostre a duração do jogo conforme exemplo abaixo.
*/

public class ex1046_tempo_de_jogo {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int inicio, fim, duracao=0;

		inicio = input.nextInt();
		fim = input.nextInt();

		if ((inicio <= 24)) {
			duracao = 24 - inicio + fim;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");

    }
}