import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

/* INCOMPLETO */

/* No Correio local há somente selos de 3 e de 5 centavos. A taxa mínima para
correspondência é de 8 centavos.

Faça um programa que determina o menor número de selos de 3 e de 5 centavos
que completam o valor de uma taxa dada. */

public class selo_correios {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		double taxa, n3 = 0, n5 = 0;
		taxa = input.nextDouble();

		/*   0,03 0,05
		0,08 = 1	1
		0,09 = 3	0
		0,10 = 0	2
		0,11 = 2	1
		0,12 = 4	0
		0,13 = 1	2
		0,14 = 3	1
		0,15 = 0	3
		*/

		if (taxa % 0.05 == 0) {
			n5 = taxa / 0.05;
		}
		// sobra 0.01
		else if (taxa % 0.05 == 1) {
			n5 = (taxa - 0.06) / 0.05;
			n3 = 2;
		}
		// sobra 0.02
		else if (taxa % 0.05 == 2) {
			n5 = (taxa - 0.12) / 0.05;
			n3 = 4;
		}
		// sobra 0.03
		else if (taxa % 0.05 == 3) {
			n3 = 1;
		}
		// sobra 0.04
		else if (taxa % 0.05 == 4) {
			n5 = (taxa - 0.09) / 0.05;
			n3 = 3;
		}

		System.out.println(n5 + " moeda(s) de 5 centavos.");
		System.out.println(n3 + " moeda(s) de 3 centavos.");

    }
}