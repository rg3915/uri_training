/*

Faça uma função que remove um elemento em um certo
índice do vetor. Por exemplo, o resultado da remoção do
elemento que está no índice 3 do vetor 000, 111, 222,
333, 444, 555 é o vetor 000, 111, 222, 444, 555. Ao final
sua função devolve o número de elementos do vetor
resultante.

antes:
+-----------------------------------+
| 100 | 111 | 222 | 333 | 444 | 555 |
+-----------------------------------+

depois
+-----------------------------+
| 100 | 111 | 222 | 444 | 555 |
+-----------------------------+

Teste de mesa
0      1     2     3     4     5
+---------------------------------+
000 | 111 | 222 | 333 | 444 | 555 |
+---------------------------------+

v[indice]	indice	n
333			   3	6
444			   3	6
444			   4	6
555			   4	6
			   5	fim
*/

public class removerElementoDoVetor {

	static int remove (int v[], int indice, int n) {
		while (indice < (n-1)) {
			v[indice] = v[indice + 1];
			indice++;
		}
		return n-1;
	}

    public static void main(String[] args) {

    	int vetor[] = new int[6];

    	vetor[0] = 000;
    	vetor[1] = 111;
    	vetor[2] = 222;
    	vetor[3] = 333;
    	vetor[4] = 444;
    	vetor[5] = 555;

    	int n = 6;
    	int indice = 3;
    	int novoN;
    	novoN = remove(vetor, indice, n);

    	for (int i=0; i<novoN; i++) {
    		System.out.println(vetor[i]);
    	}
	}
}
