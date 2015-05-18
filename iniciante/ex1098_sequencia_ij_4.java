import java.io.IOException;
import java.util.Scanner;

/*
I=0 J=1
I=0 J=2
I=0 J=3
I=0.2 J=1.2
I=0.2 J=2.2
I=0.2 J=3.2
.....
I=2 J=?
I=2 J=?
I=2 J=?
*/

public class ex1098_sequencia_ij_4 {

    public static void main(String[] args) {

    	for (int i=0; i<=20; i+=2) {
    		if ((i == 0) || (i == 10) || (i == 20)) {
    			System.out.println("I=" + (float)i/10 + " J=" + (float)i/10 + 1);
    			System.out.println("I=" + (float)i/10 + " J=" + (float)i/10 + 2);
    			System.out.println("I=" + (float)i/10 + " J=" + (float)i/10 + 3);
    		} else {
    			System.out.println("I=" + (float)i/10 + " J=" + (float)i/10 + 1);
    			System.out.println("I=" + (float)i/10 + " J=" + (float)i/10 + 2);
    			System.out.println("I=" + (float)i/10 + " J=" + (float)i/10 + 3);
    		}
    	}

    }
}
