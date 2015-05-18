import java.io.IOException;
import java.util.Scanner;
 
public class ex1003 {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int a, b, soma;

		a = input.nextInt();
		b = input.nextInt();

		soma = a + b;
		System.out.println("SOMA = " + soma);

    }
}