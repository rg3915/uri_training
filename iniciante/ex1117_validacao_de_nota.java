import java.io.IOException;
import java.util.Scanner;

/* Faça um programa que leia as notas referentes às duas avaliações de um
aluno. Calcule e imprima a média semestral. Faça com que o algoritmo só aceite
notas válidas (uma nota válida deve pertencer ao intervalo [0,10]). Cada nota
deve ser validada separadamente.

Entrada

A entrada contém vários valores reais, positivos ou negativos. O programa deve
ser encerrado quando forem lidas duas notas válidas.

Saída

Se uma nota inválida  for lida, deve ser impressa a mensagem "nota invalida".
Quando duas notas válidas forem lidas, deve ser impressa a mensagem "media = "
seguido do valor do cálculo. O valor deve ser apresentado com duas casas após
o ponto decimal. */

public class ex1117_validacao_de_nota {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	double n, soma=0.0;
    	int c=0;

    	while (c<2) {
			n = input.nextDouble();
			if (n >=0 && n <= 10) {
				c++;
				soma += n;
			} else {
				System.out.println("nota invalida");
			}
		}

    	System.out.println("media = " + soma*0.5);
    }
}
