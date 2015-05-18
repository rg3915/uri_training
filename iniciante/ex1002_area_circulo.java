import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;
 
public class ex1002 {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.0000");
		double raio, pi, area;

		System.out.print("Raio: ");
		raio = input.nextDouble();
		pi = 3.14159;
		area = pi * raio * raio;
		System.out.println("A= " + df.format(area));

    }
}