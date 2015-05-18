import java.io.IOException;
import java.util.Scanner;

public class dicas {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int entrada = 1;
		int soma = 0;

		while (entrada != 0) {
			entrada = input.nextInt();
			System.out.println(entrada);
			soma += entrada;
		}
		System.out.println(soma);
	}
}