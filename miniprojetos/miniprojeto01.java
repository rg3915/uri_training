import java.io.IOException;
import java.util.Scanner;

public class miniprojeto01 {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		String sexo = "M";
		double M = 0.0, menor24 = 0.0;
		int meses, total = 0;

		while (sexo.charAt(0) != 'S') {
			System.out.print("Sexo (M ou F): ");
			sexo = input.next();
			if (sexo.charAt(0) == 'S') {
				break;
			}
			System.out.print("Meses de vida: ");
			meses = input.nextInt();

			if (sexo.charAt(0) == 'M') {
				M++;
			}

			if (meses <= 24) {
				menor24++;
			}
			
			total++;
		}
		System.out.println("Quant. de criancas mortas: " + total);
		System.out.println("Porcentagem de criancas do sexo masculino mortas no mes: " + (M/total) * 100 + "%");
		System.out.println("Porcentagem de criancas que viveram 24 meses ou menos no mes: " + (menor24/total) * 100 + "%");
	}
}