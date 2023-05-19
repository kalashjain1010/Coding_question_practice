import java.io.*;
import java.util.*;

public class Cars {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner sc = new Scanner(System.in);
        int V = sc.nextInt();
        int W = sc.nextInt();
        
        int Y = (W - 2*V)/2 ;
        int X = V - Y;
        
        System.out.println(X);
         System.out.println(Y);
         //ans
    }
}