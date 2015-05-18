import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

/* Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal,
correspondente às quatro notas de um aluno. Calcule a média com pesos 2, 3, 4
e 1, respectivamente, para cada uma destas notas e mostre esta média
acompanhada pela mensagem "Media: ". Se esta média for maior ou igual a 7.0,
imprima a mensagem "Aluno aprovado.". Se a média calculada for inferior a 5.0,
imprima a mensagem "Aluno reprovado.". Se a média calculada for um valor entre
5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em
exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame
obtida pelo aluno. Imprima então a mensagem "Nota do exame: " acompanhada pela
nota digitada. Recalcule a média (some a pontuação do exame com a média
anteriormente calculada e divida por 2). e imprima a mensagem "Aluno
aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", (caso
a média tenha ficado 4.9 ou menos). Para estes dois casos (aprovado ou
reprovado após ter pego exame) apresente na última linha uma mensagem "Media
final: " seguido da média final para esse aluno.

Entrada
A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

Saída
Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens
devem ser impressas conforme a descrição do problema. Não esqueça de imprimir
o enter após o final de cada linha, caso contrário obterá "Presentation
Error". */

public class ex1040_media3 {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0");
		double N1, N2, N3, N4;
		double MEDIA, EXAME;

		N1 = input.nextDouble();
		N2 = input.nextDouble();
		N3 = input.nextDouble();
		N4 = input.nextDouble();

		MEDIA = (N1*2 + N2*3 + N3*4 + N4*1)/10;

		System.out.println("Media: " + df.format(MEDIA));

		if (MEDIA >= 7) {
			System.out.println("Aluno aprovado.");
		}
		else if (MEDIA < 5) {
			System.out.println("Aluno reprovado.");
		}
		else {
			System.out.println("Aluno em exame.");
			EXAME = input.nextDouble();
			System.out.println("Nota do exame: " + df.format(EXAME));
			System.out.println("Aluno aprovado.");
			System.out.println("Media final: " + df.format((EXAME + MEDIA)/2));
		}

    }
}