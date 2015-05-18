import java.text.DecimalFormat;

/*
Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
S = 1 + 1/2 + 1/3 + … + 1/100

Entrada

Não há nenhuma entrada neste problema.

Saída

A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.
*/

public class ex1155_sequencia_s {

    public static void main(String[] args) {
    	DecimalFormat df = new DecimalFormat("0.00");
    	double s = 1.0;

    	for (int i=2; i <= 100; i++) {
    		s += 1.0 / (double) i;
    	}
    	System.out.println(df.format(s));
    }
}
