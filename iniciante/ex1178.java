/* Leia um valor X. Coloque este valor na primeira posição de um vetor N[100].
Em cada posição subsequente de N (1 até 99), coloque a metade do valor
armazenado na posição anterior, conforme o exemplo abaixo. Imprima o vetor N.

Entrada

A entrada contem um valor de dupla precisão com 4 casas decimais.

Saída

Para cada posição do vetor N, escreva "N[i] = Y", onde i é a posição do vetor
e Y é o valor armazenado naquela posição. Cada valor do vetor deve ser
apresentado com 4 casas decimais.

Entrada: 200.0000

Saida:

N[0] = 200.0000
N[1] = 100.0000
N[2] = 50.0000
N[3] = 25.0000
N[4] = 12.5000
...
*/

import java.util.Scanner;
import java.text.DecimalFormat;

public class ex1178 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");
    	double n, j;

        n=input.nextInt();

        double v[] = new double[100];

        j=n;

        for (int i=0; i < 100; i++) {
            v[i] = j;
            System.out.println("N[" + i + "] = " + v[i]);
            j/=2;
        }
    }
}