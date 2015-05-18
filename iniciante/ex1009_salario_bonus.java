import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Faça um programa que leia o nome de um vendedor, o seu salário fixo e o
total de vendas efetuadas por ele no mês (em dinheiro). Sabendo que este
vendedor ganha 15% de comissão sobre suas vendas efetuadas, informar o total a
receber no final do mês, com duas casas decimais.

Entrada
O arquivo de entrada contém um texto (primeiro nome do vendedor) e 2
valores de dupla precisão (double) com duas casas decimais, representando o
salário fixo do vendedor e montante total das vendas efetuadas por este
vendedor, respectivamente.

Saída
Imprima o total que o funcionário deverá receber, conforme exemplo fornecido.
*/

public class ex1009 {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		String NOME;
		double SALARIO, VENDAS, TOTAL;

		NOME = input.next();
		SALARIO = input.nextDouble();
		VENDAS = input.nextDouble();

		TOTAL = SALARIO + VENDAS * 0.15;
		System.out.println("TOTAL = R$ " + df.format(TOTAL));

    }
}