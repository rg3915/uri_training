import java.util.Scanner;

/* Faça um algoritmo para ler um número indeterminado de dados, contendo cada
um, a idade de um indivíduo. O último dado, que não entrará nos cálculos,
contém o valor de idade negativa. Calcular e imprimir a idade média deste
grupo de indivíduos.

Entrada

A entrada contém um número indeterminado de inteiros. A entrada será encerrada
quando um valor negativo for lido.

Saída

A saída contém um valor correspondente à média de idade dos indivíduos.

A média deve ser impressa com dois dígitos após o ponto decimal.
*/

public class ex1154_idades {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	int n=0, count=0;
    	double s = 0.0;
		
		while(n >= 0) {
			s += n;
			count++;
			n = input.nextInt();
		}
		System.out.println(s / count);
    }
}
