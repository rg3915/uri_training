import java.text.DecimalFormat;

/*
Escreva um algoritmo para calcular e escrever o valor de S, sendo S dado pela fórmula:
S = 1 + 3/2 + 5/4 + 7/8 + ... + 39/?

Entrada

Não há nenhuma entrada neste problema.

Saída

A saída contém um valor correspondente ao valor de S.
O valor deve ser impresso com dois dígitos após o ponto decimal.
*/

public class ex1156_sequencia_s_ii {

    public static void main(String[] args) {
    	DecimalFormat df = new DecimalFormat("0.00");
    	double s = 1.0, x = 2.0;
    	int i;

    	for (i = 3; i <= 39; i += 2) {
    		s += i/x;
    		x *= 2;
    	}
    	System.out.println(df.format(s));
    }
}
