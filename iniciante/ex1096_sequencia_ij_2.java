import java.io.IOException;
import java.util.Scanner;

/*
I=1 J=7
I=1 J=6
I=1 J=5
I=3 J=7
I=3 J=6
I=3 J=5
...
I=9 J=7
I=9 J=6
I=9 J=5
*/

public class ex1096_sequencia_ij_2 {

    public static void main(String[] args) {
    	int i=1, j=7;

    	while (i <= 9) {
	    	while (j >= 5) {
	    		System.out.println("I=" + i + " J=" + j);
	    		j--;
	    	}
	    	j=7;
	    	i+=2;
	    }
    }
}
