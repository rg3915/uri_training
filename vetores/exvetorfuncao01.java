/*

Faça uma função que receba um vetor como parâmetro,
com seu respectivo tamanho e um valor inteiro para ser
procurado no vetor. Sua função retorna o índice da última
ocorrência do valor procurado no vetor, caso o número não
esteja no vetor é devolvido -1.

+----------------------+
| 6 | 8 | 3| 8 | 0 | 0 |
+----------------------+

*/

public class exvetorfuncao01 {

	static int busca (int v[], int n, int k) {
		for (int i = n-1; i >= 0; i--) {
            if (v[i] == k) {
				return i;
			}
		}
		return -1;
	}

    public static void main(String[] args) {

    	int vet[] = new int[6];

    	vet[0]=6;
    	vet[1]=8;
    	vet[2]=3;
    	vet[3]=8;

    	int tamanho = 4;
    	int resultado;

    	resultado = busca(vet, tamanho, 8);

        System.out.println(resultado);

	}
}
