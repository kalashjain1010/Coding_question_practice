import java.io.*;
import java.util.*;

public class validString {

    public static void main(String[] args) {
        /*
         * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
         * class should be named Solution.
         */
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int count = 0;
        int count2 = 0;
        char ch;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '*') {
                count++;
            } else if (S.charAt(i) == '#') {
                count2++;
            }

        }

        if(count>count2){
            System.out.println(count-count2);
        }
        else if(count2>count){
            System.out.println(count2-count);
        }

        else if(count == count2){
            System.out.println(0);
        }

    }
}
