import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Leia um valor de ponto flutuante com duas casas decimais. Este valor
representa um valor monetário. A seguir, calcule o menor número de notas e
moedas possíveis no qual o valor pode ser decomposto. As notas consideradas
são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10,
0.05 e 0.01. A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o
valor inicial, conforme exemplo fornecido. */

public class ex1021_notas_moedas {
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");
        double n100 = 0, n50 = 0, n20 = 0, n10 = 0, n5 = 0, n2 = 0, n1 = 0;
        double centavos, N, m50 = 0, m25 = 0, m10 = 0, m5 = 0, m1 = 0;
        N = input.nextDouble();

        centavos = N*100;

        n100 = N / 100.0;
        N %= 100;
        n50 = N / 50.0;
        N %= 50;
        n20 = N / 20.0;
        N %= 20;
        n10 = N / 10.0;
        N %= 10;
        n5 = N / 5.0;
        N %= 5;
        n2 = N / 2.0;
        N %= 2;
        n1 = N / 1.0;
        N %= 1;
        centavos = centavos % 100;
        m50 = centavos / 50;
        centavos %= 50;
        m25 = centavos / 25;
        centavos %= 25;
        m10 = centavos / 10;
        centavos %= 10;
        m5 = centavos / 5;
        centavos %= 5;
        m1 = centavos;

        System.out.println("NOTAS:");
        System.out.println((int)n100 + " nota(s) de R$ 100.00");
        System.out.println((int)n50 + " nota(s) de R$ 50.00");
        System.out.println((int)n20 + " nota(s) de R$ 20.00");
        System.out.println((int)n10 + " nota(s) de R$ 10.00");
        System.out.println((int)n5 + " nota(s) de R$ 5.00");
        System.out.println((int)n2 + " nota(s) de R$ 2.00");
        System.out.println("MOEDAS:");
        System.out.println((int)n1 + " moeda(s) de R$ 1.00");
        System.out.println((int)m50 + " moeda(s) de R$ 0.50");
        System.out.println((int)m25 + " moeda(s) de R$ 0.25");
        System.out.println((int)m10 + " moeda(s) de R$ 0.10");
        System.out.println((int)m5 + " moeda(s) de R$ 0.05");
        System.out.println((int)m1 + " moeda(s) de R$ 0.01");

    }
}