import java.io.IOException;
import java.util.Scanner;

/*
I=1 J=60
I=4 J=55
I=7 J=50
...
I=? J=0
*/

public class ex1095_sequencia_ij_1 {

    public static void main(String[] args) {
    	int i=1, j=60;

    	while (j >= 0) {
    		System.out.println("I=" + i + " J=" + j);
    		i+=3;
    		j-=5;
    	}
    }
}
