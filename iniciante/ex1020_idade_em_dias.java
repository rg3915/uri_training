import java.io.IOException;
import java.util.Scanner;

/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias
Obs.: apenas para facilitar o cálculo, considere todo ano com 365 dias e todo mês com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.
Entrada
O arquivo de entrada contém um valor inteiro.
Saída
Imprima a saída conforme exemplo fornecido.
*/

public class ex1020_idade_em_dias {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int a, anos, meses, dias;

		a = input.nextInt();

		anos = a / 365;
		meses = (a % 365) / 30;
		dias = (a % 365) % 30;
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");

    }
}