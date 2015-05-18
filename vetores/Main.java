import java.util.Scanner;

public class Main {

	static int adicionarFinal (int v[], int valor, int n) {
		v[n-1] = valor;
		return n;
	}

	static int adicionar (int v[], int indice, int n) {
		while (indice < (n-1)) {
			v[indice + 1] = v[indice];
			indice++;
		}
		return n;
	}

	static int remover (int v[], int indice, int n) {
		while (indice < (n-1)) {
			v[indice] = v[indice + 1];
			indice++;
		}
		return n-1;
	}

    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int entrada = 0;
		int i;
		int v[] = new int[100];
		int novoV;

		// System.out.print("CPF: ");
		String cpf;
		cpf = input.next();

		/************************************************************/
		/* VALIDACAO PARA CPF                                       */

		// validar o tamanho da string
		if (cpf.length() != 14) {
			System.out.println("O CPF deve conter 11 digitos no formato XXX.XXX.XXX-XX: ");
			System.exit(0);
		}

		char aa4 = cpf.charAt(3); // ".";
		char aa8 = cpf.charAt(7); // ".";
		char aa12 = cpf.charAt(11); // "-";

		// validar a entrada de dados
		if ((aa4 != '.') | (aa8 != '.') | (aa12 != '-')) {
			System.out.println("O CPF deve ser no formato XXX.XXX.XXX-XX: ");
			System.exit(0);
		}

		/** Formato do CPF XXX.XXX.XXX-XX **/
		/** Considere a1=X, a2=X, ..., a9=X, aa4=., aa8=., aa12=- **/
		/** Considere d1=X e d2=X os dois ultimos digitos **/

		int a1 = Character.getNumericValue(cpf.charAt(0));
		int a2 = Character.getNumericValue(cpf.charAt(1));
		int a3 = Character.getNumericValue(cpf.charAt(2));
		int a4 = Character.getNumericValue(cpf.charAt(4));
		int a5 = Character.getNumericValue(cpf.charAt(5));
		int a6 = Character.getNumericValue(cpf.charAt(6));
		int a7 = Character.getNumericValue(cpf.charAt(8));
		int a8 = Character.getNumericValue(cpf.charAt(9));
		int a9 = Character.getNumericValue(cpf.charAt(10)); // antipenultimo digito
		int d1 = Character.getNumericValue(cpf.charAt(12));
		int d2 = Character.getNumericValue(cpf.charAt(13));

		int b1, b2;

		// calculo do primeiro digito verificador
		b1 = (1*a1 + 2*a2 + 3*a3 + 4*a4 + 5*a5 + 6*a6 + 7*a7 + 8*a8 + 9*a9) % 11;

		if (b1 == 10) {
			b1 = 0;
		}

		// calculo do segundo digito verificador
		b2 = (9*a1 + 8*a2 + 7*a3 + 6*a4 + 5*a5 + 4*a6 + 3*a7 + 2*a8 + 1*a9) % 11;

		if (b2 == 10) {
			b2 = 0;
		}

		// validar o digito verificador
		if ((b1 != d1) | (b2 != d2)) {
			System.out.println("CPF invalido. Acesso negado!");
			System.exit(0);
		}

		/* FIM VALIDACAO PARA CPF                                   */
		/************************************************************/

		/************************************************************/
		/* MENU														*/

		while (entrada != 8) {
			System.out.println("Menu");
			System.out.println("1. Adicionar um elemento no final da colecao.");
			System.out.println("2. Adicionar um dado elemento em uma dada posicao.");
			System.out.println("3. Remover o elemento de uma dada posicao.");
			System.out.println("4. Remover todas as ocorrencias de um elemento na colecao.");
			System.out.println("5. Verificar se dado elemento esta contido na colecao.");
			System.out.println("6. Verificar se dado um elemento existem dois numeros na colecao que somados eh igual ao elemento informado.");
			System.out.println("7. Remover todas repeticoes da colecao");
			System.out.println("8. Sair");

			entrada = input.nextInt();

			if (entrada < 1 || entrada > 8) {
				System.out.println("================= Opcao invalida! =================");
			}
			if (entrada == 8) {
				System.exit(0);
			}

			/* FIM DO MENU												*/
			/************************************************************/

			/************************************************************/
			/* VETOR													*/
			for (i=0; i<100; i++) {
				v[i] = i;
				// System.out.print(v[i] + " ");
			}
				// System.out.println("");
			/************************************************************/

			/************************************************************/
			/* 1.														*/

			// novoV = adicionarFinal(v,200,100);

			// for (i=0; i<novoV; i++) {
			// 	System.out.print(v[i] + " ");
			// }

			/************************************************************/

			/************************************************************/
			/* 2.														*/

			// novoV = adicionar(v,98,900);

			// for (i=0; i<novoV; i++) {
			// 	System.out.print(v[i] + " ");
			// }

			/************************************************************/

			/************************************************************/
			/* 3.														*/

			if (entrada == 3) {

				System.out.print("Digite o indice a ser removido: ");
				i = input.nextInt();

				novoV = remover(v,i,100);

				for (i=0; i<novoV; i++) {
					System.out.print(v[i] + " ");
				}

				System.out.println("\n" + novoV);
			}

			/************************************************************/
		} // FIM DO MENU
    }
}
