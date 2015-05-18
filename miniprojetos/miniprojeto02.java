import java.io.IOException;
import java.util.Scanner;

public class miniprojeto02 {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		String tipo_consumidor;
		double preco;
		int num = -1, consumo = 0, maior_consumo, menor_consumo, consumo_total = 0;
		double totalR = 0.0, totalC = 0.0, totalI = 0.0, i = 0.0;

		maior_consumo = 0;
		menor_consumo = Integer.MAX_VALUE;

		while (num != 0) {
			System.out.print("Preco do kWh consumido: ");
			preco = input.nextDouble();
			System.out.print("Numero do consumidor: ");
			num = input.nextInt();

			if (num == 0) {
				break;
			}

			System.out.print("Quantidade de kWh consumidos durante o mes: ");
			consumo = input.nextInt();
			System.out.print("Tipo de consumidor (Residencial, Comercial, Industrial): ");
			tipo_consumidor = input.next();
			
			System.out.println("Numero: " + num + " Total a pagar: " + preco * consumo);

			if (consumo > maior_consumo) {
				maior_consumo = consumo;
			}

			if (consumo < menor_consumo) {
				menor_consumo = consumo;
			}

			if (tipo_consumidor.charAt(0) == 'R') {
				totalR += consumo;
			}
			if (tipo_consumidor.charAt(0) == 'C') {
				totalC += consumo;
			}
			if (tipo_consumidor.charAt(0) == 'I') {
				totalI += consumo;
			}

			consumo_total += consumo;
			i++;

		}
		System.out.println("Maior consumo: " + maior_consumo);
		System.out.println("Menor consumo: " + menor_consumo);
		System.out.println("Total Residencial: " + totalR);
		System.out.println("Total Comercial: " + totalC);
		System.out.println("Total Industrial: " + totalI);
		System.out.println("Media geral do consumo: " + consumo_total/i);
	}
}