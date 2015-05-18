import java.util.Scanner;

/* Escreva um programa para ler as notas da primeira e a segunda avaliação de
um aluno. Calcule e imprima a média semestral. O programa só deverá aceitar
notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota
deve ser validada separadamente.

No final deve ser impressa a mensagem “novo calculo (1-sim 2-nao)”,
solicitando ao usuário que informe um código (1 ou 2) indicando se ele deseja
ou não executar o algoritmo novamente, (aceitar apenas os código 1 ou 2). Se
for informado o código 1 deve ser repetida a execução de todo o programa para
permitir um novo cálculo, caso contrário o programa deve ser encerrado.

Entrada

O arquivo de entrada contém vários valores reais, positivos ou negativos.
Quando forem lidas duas notas válidas, deve ser lido um valor inteiro X . O
programa deve parar quando o valor lido para este X for igual a 2.

Saída

Se uma nota inválida for lida, deve ser impressa a mensagem “nota invalida”.
Quando duas notas válidas forem lidas, deve ser impressa a mensagem “media = ”
seguido do valor do cálculo.

Antes da leitura de X deve ser impressa a mensagem "novo calculo (1-sim
2-nao)" e esta mensagem deve ser apresentada novamente se o valor da entrada
padrão para X for menor do que 1 ou maior do que 2, conforme o exemplo abaixo.

A média deve ser impressa com dois dígitos após o ponto decimal. */

public class ex1118_varias_notas_com_validacao {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	double n, s;
    	int r, c;

    	do {
    		c = 0;
    		s = 0.0;	
	    	while (c<2) {
				n = input.nextDouble();
				if (n >=0 && n <= 10) {
					s += n;
					c++;
				} else {
					System.out.println("nota invalida");
				}
			}
	    	System.out.println("media = " + s*0.5);
	    	do {
	    		System.out.println("novo calculo (1-sim 2-nao)");
	    		r = input.nextInt();
	    	} while (r != 1 && r != 2);
		} while (r != 2);
    }
}
