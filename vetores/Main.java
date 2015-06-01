import java.io.File;
import java.io.FileWriter;
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

	static int removerElemento (int v[], int numero) {
		int i=0, j=0, novoV;
		while (i < 100) {
			if (v[i] == numero) {
				novoV = remover(v,i,100);
				j++;
			}
			i++;
		}
		return 100-j;
	}

	static int removerRepeticao (int v[]) {
		int i=0, j=0, novoV;
		for (i=0; i<100; i++) {
			while (j < 100) {
				if (i != j) {
					if (v[i] == v[j]) {
						novoV = remover(v,j,100);
						j++;
					}
				}
			}
		}
		return 100-j;
	}

	static boolean pertence (int v[], int numero) {
		for (int i=0; i<100; i++) {
			if (v[i] == numero) {
				return true;
			}
		}
		return false;
	}

    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int entrada = 0;
		int i;
		int v[] = new int[100];
		int novoV, numero;

		// System.out.print("CPF: ");
		String cpf;
		// cpf = input.next();
		cpf = "977.478.774-98";

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
			System.out.println("0. Imprimir colecao.");
			System.out.println("1. Adicionar um elemento no final da colecao.");
			System.out.println("2. Adicionar um dado elemento em uma dada posicao.");
			System.out.println("3. Remover o elemento de uma dada posicao.");
			System.out.println("4. Remover todas as ocorrencias de um elemento na colecao.");
			System.out.println("5. Verificar se dado elemento esta contido na colecao.");
			System.out.println("6. Verificar se dado um elemento existem dois numeros na colecao que somados eh igual ao elemento informado.");
			System.out.println("7. Remover todas repeticoes da colecao");
			System.out.println("8. Sair");

			entrada = input.nextInt();

			if (entrada < 0 || entrada > 8) {
				System.out.println("================= Opcao invalida! =================");
			}
			if (entrada == 8) {
				System.exit(0);
			}

			/* FIM DO MENU												*/
			/************************************************************/

			/************************************************************/
			/* VETOR													*/

			v[0] = 0;
			v[1] = 1;
			v[2] = 2;
			v[3] = 3;
			v[4] = 15;
			v[5] = 8;
			v[6] = 0;
			v[7] = 12;
			v[8] = 16;
			v[9] = 6;
			v[10] = 5;
			v[11] = 11;
			v[12] = 8;
			v[13] = 10;
			v[14] = 7;
			v[15] = 18;
			v[16] = 2;
			v[17] = 4;
			v[18] = 10;
			v[19] = 11;
			v[20] = 7;
			v[21] = 17;
			v[22] = 12;
			v[23] = 0;
			v[24] = 6;
			v[25] = 17;
			v[26] = 10;
			v[27] = 2;
			v[28] = 4;
			v[29] = 11;
			v[30] = 13;
			v[31] = 18;
			v[32] = 11;
			v[33] = 2;
			v[34] = 2;
			v[35] = 12;
			v[36] = 5;
			v[37] = 6;
			v[38] = 16;
			v[39] = 11;
			v[40] = 15;
			v[41] = 4;
			v[42] = 3;
			v[43] = 11;
			v[44] = 1;
			v[45] = 7;
			v[46] = 11;
			v[47] = 9;
			v[48] = 11;
			v[49] = 15;
			v[50] = 18;
			v[51] = 7;
			v[52] = 8;
			v[53] = 5;
			v[54] = 7;
			v[55] = 6;
			v[56] = 10;
			v[57] = 13;
			v[58] = 11;
			v[59] = 9;
			v[60] = 1;
			v[61] = 9;
			v[62] = 20;
			v[63] = 3;
			v[64] = 5;
			v[65] = 9;
			v[66] = 19;
			v[67] = 15;
			v[68] = 15;
			v[69] = 20;
			v[70] = 10;
			v[71] = 19;
			v[72] = 14;
			v[73] = 3;
			v[74] = 9;
			v[75] = 17;
			v[76] = 2;
			v[77] = 5;
			v[78] = 1;
			v[79] = 12;
			v[80] = 20;
			v[81] = 15;
			v[82] = 19;
			v[83] = 9;
			v[84] = 17;
			v[85] = 4;
			v[86] = 16;
			v[87] = 18;
			v[88] = 10;
			v[89] = 5;
			v[90] = 3;
			v[91] = 12;
			v[92] = 17;
			v[93] = 13;
			v[94] = 7;
			v[95] = 16;
			v[96] = 9;
			v[97] = 5;
			v[98] = 16;
			v[99] = 17;

			/************************************************************/

			/************************************************************/
			/* 0.														*/

			if (entrada == 0) {
				for (i=0; i<100; i++) {
					System.out.print(v[i] + " ");
				}
			}

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
			/* 3. Remover o elemento de uma dada posicao.				*/

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

			/**************************************************************/
			/* 4. Remover todas as ocorrencias de um elemento na colecao. */

			if (entrada == 4) {

				System.out.print("Digite um numero a ser removido: ");
				numero = input.nextInt();

				novoV = removerElemento(v,numero);

				for (i=0; i<novoV; i++) {
					System.out.print(v[i] + " ");
				}

				System.out.println("\n" + novoV);

			}
			/************************************************************/

			/************************************************************/
			/* 5. Verificar se dado elemento esta contido na colecao. 	*/

			if (entrada == 5) {

				System.out.print("Digite um numero: ");
				numero = input.nextInt();

				boolean p = pertence(v,numero);

				if (p == true) {
					System.out.println("Pertence");
				} else {
					System.out.println("Nao pertence");
				}
			}
			/************************************************************/

			/************************************************************/
			/* 7. Remover todas repeticoes da colecao				 	*/

			if (entrada == 7) {
			
				novoV = removerRepeticao(v);

				for (i=0; i<100; i++) {
					System.out.println(v[i] + " ");
				}
					System.out.println("\n" + novoV);
			}
			/************************************************************/




			/************************************************************/
		} // FIM DO MENU
    }
}
