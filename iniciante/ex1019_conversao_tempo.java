import java.io.IOException;
import java.util.Scanner;

/*
Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica
e informe-o expresso no formato horas:minutos:segundos.
Entrada
O arquivo de entrada contém um valor inteiro N.
Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
*/

public class ex1019_conversao_tempo {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int N, horas, minutos, segundos;

		N = input.nextInt();

		horas = N / 3600;
		minutos = (N % 3600) / 60;
		segundos = (N % 3600) % 60;
		System.out.println(horas + ":" + minutos + ":" + segundos);

    }
}