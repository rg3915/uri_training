import java.util.Scanner;

/*
Verifique se um número é primo ou não.

Teste de mesa
numero  i   resto = 0?
31      2   não
31      3   não
31      4   não
...
31      30  não
31      31  sim
*/

public class numero_primo {

    static boolean verificaPrimo (int numero) {
        for (int i=2; i<numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        int n;

        System.out.print("Digite um numero: ");
        n = input.nextInt();

        if (verificaPrimo(n) == true) {
            System.out.println("Eh primo");
        }
        else {
            System.out.println("Nao eh primo");
        }

    }
}