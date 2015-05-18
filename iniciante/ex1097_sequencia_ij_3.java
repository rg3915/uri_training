import java.io.IOException;
import java.util.Scanner;

/*
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=9
I=3 J=8
I=3 J=7
...
I=9 J=15
I=9 J=14
I=9 J=13
*/

public class ex1097_sequencia_ij_3 {

    public static void main(String[] args) {
    	int i=1, c, j=7;

    	while (i <= 9) {
    		c=1;
	    	while (c <= 3) {
	    		System.out.println("I=" + i + " J=" + j);
	    		j--;
	    		c++;
	    	}
	    	j+=5;
	    	i+=2;
	    }
    }
}
