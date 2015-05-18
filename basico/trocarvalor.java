import java.util.Scanner;

/* Escreva um programa que leia dois valores para as variáveis A e B, efetue a
troca dos valores de forma que a variável A passe a possuir o valor da
variável B e que a variável B passe a possuir o valor da variável A.
Apresentar os valores trocados. */

public class trocarvalor {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        a = input.nextInt();
        b = input.nextInt();

        c=b;
        b=a;
        a=c;
        System.out.println(a);
        System.out.println(b);
	}
}
