/*
vet = []

+-------------------------+
| 6 | 8 | 12 | 13 | 0 | 0 |
+-------------------------+

cont = 4
*/

public class vetores_funcao01 {

	static int busca (int v[], int n, int k) {
		for (int i = 0; i < n; i++) {
			if (v[i] == k) {
				return 1;
			}
		}
		return 0;
	}

    public static void main(String[] args) {

    	int vet[] = new int[6];

    	vet[0]=6;
    	vet[1]=8;
    	vet[2]=12;
    	vet[3]=13;

    	int cont = 4;
    	int resultado;

    	resultado = busca(vet, cont, 13);

    	if (resultado == 1) {
    		System.out.println("Numero encontrado");
    	} else {
    		System.out.println("Nao encontrado");
    	}
	}
}
