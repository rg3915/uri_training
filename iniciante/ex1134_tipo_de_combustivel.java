import java.util.Scanner;

/* Um Posto de combustíveis deseja determinar qual de seus produtos tem a
preferência de seus clientes. Escreva um algoritmo para ler o tipo de
combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1
a 4) deve ser solicitado um novo código (até que seja válido). O programa será
encerrado quando o código informado for o número 4.

Entrada

A entrada contém apenas valores inteiros e positivos.

Saída

Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
abasteceram cada tipo de combustível, conforme exemplo. */

public class ex1134_tipo_de_combustivel {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n;
    	int v[] = new int[3];
		
		while (n = input.nextInt() && n != 4) {
			if (n >= 1 && n <= 3) {
				v[n-1]++;
			}
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + v[0]);
		System.out.println("Gasolina: " + v[1]);
		System.out.println("Diesel: " + v[2]);
    }
}
