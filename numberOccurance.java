import java.util.*;

public class numberOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number :");
        int x = (sc.nextInt());
        System.out.println("enter a digit :");
        int digit = (sc.nextInt()) ;
        sc.close();

        int count=0;

        for (int i = 1; i < x; i++) {
            
            int n =i;
            while(n>0){
                int mode = n%10;
                n=n/10;

                if (mode==digit) {
                    count++;
                }
            }
        }
        System.out.println("no. is "+ count);
        int k= 5%10;
        System.out.println(k);
    }
}
