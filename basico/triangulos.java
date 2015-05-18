import java.util.Scanner;

/*
Considere os lados do triângulo A,B e C, assim temos as seguintes classificações:

* Isósceles: Quando possui dois lados iguais e um diferente

* Escaleno: Quando possui todos os lados diferentes

* Equilátero: Quando possui todos os lados iguais.

Teste de mesa

A 	B 	C
5	5	5	equilatero
5	4	5	isósceles
5	5	4	isósceles
4	5	5	isósceles
*/

public class triangulos {
 
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
        int a, b, c;

        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();

        if ((a == b) && (b == c)) {
        	System.out.println("Equilatero");
        }
        if ((a == b) || (b == c) || (c == a)) {
        	System.out.println("Isosceles");
        }
        else {
        	System.out.println("Escaleno");
        }
    }
}