import java.io.IOException;
import java.util.Scanner;
import static java.lang.Math.abs;

/* Dois carros (X e Y) partem em uma mesma direção. O carro X sai com
velocidade constante de 60 Km/h e o carro Y sai com velocidade constante de 90
Km/h. Leia a distância (em Km) e calcule quanto tempo leva (em minutos) para o
carro Y tomar essa distância do outro carro.

Entrada
O arquivo de entrada contém um número inteiro.

Saída
Imprima o tempo necessário seguido da mensagem " minutos".
*/

public class ex1016_distancia {
    public static void main(String[] args) throws IOException {
 
		Scanner input = new Scanner(System.in);
		int distancia;
		double t;

		distancia = input.nextInt();
		/* S = s0 + vt
		s1 + v1t = s2 + v2t
		t = (s1 - s2)/(v2-v1)
		*/

		t = abs(-distancia/(90 - 60.0)) * 60;

		System.out.println((int) t + " minutos");

    }
}