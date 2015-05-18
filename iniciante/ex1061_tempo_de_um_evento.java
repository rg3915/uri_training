import java.io.IOException;
import java.util.Scanner;

/* Pedrinho está organizando um evento em sua Universidade. O evento deverá
ser no mês de Abril, iniciando e terminando dentro do mês. O problema é que
Pedrinho quer calcular o tempo em segundos que o evento vai durar, uma vez que
ele sabe quando inicia e quando termina o evento..

Sabendo que o evento pode durar de poucos segundos a vários dias, você deverá
ajudar Pedrinho a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”, seguido de um
espaço e o dia do mês no qual o evento vai começar. Na linha seguinte, será
informado o momento no qual o evento vai iniciar, no formato hh : mm : ss. Na
terceira e quarta linha de entrada haverá outra informação no mesmo formato
das duas primeiras linhas, indicando o término do evento.

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:

W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.
*/

public class ex1061_tempo_de_um_evento {

    public static void main(String[] args) throws IOException {
    	Scanner input = new Scanner(System.in);
    	int dia_ini, dia_fim, hora_ini, min_ini, seg_ini, hora_fim, min_fim, seg_fim;
    	int segundos, minutos, horas, dias;
    	String inicio, fim;

		dia_ini = input.nextInt();
		inicio = input.next();
		dia_fim = input.nextInt();
		fim = input.next();

		// extrair os dados da string
		hora_ini = Integer.parseInt(inicio.substring(0,2));
		min_ini = Integer.parseInt(inicio.substring(3,5));
		seg_ini = Integer.parseInt(inicio.substring(6,8));
		hora_fim = Integer.parseInt(fim.substring(0,2));
		min_fim = Integer.parseInt(fim.substring(3,5));
		seg_fim = Integer.parseInt(fim.substring(6,8));

		// calcular a diferenca
		segundos = seg_fim - seg_ini;
		minutos = min_fim - min_ini;
		horas = hora_fim - hora_ini;
		dias = dia_fim - dia_ini;

		if (segundos < 0) {
			segundos += 60;
			minutos--;
		}

		if (minutos < 0) {
			minutos += 60;
			horas--;
		}

		if (horas < 0) {
			horas += 24;
			dias--;
		}

		System.out.println(dias + " dia(s)");
		System.out.println(horas + " hora(s)");
		System.out.println(minutos + " minuto(s)");
		System.out.println(segundos + " segundo(s)");
   }
}