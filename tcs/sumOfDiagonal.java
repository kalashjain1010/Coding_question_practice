// package tcs;
import java.util.*;

public class sumOfDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        // int[][] array = new int[k][k];
        int[][] arr = new int[k][k];
        
        
        for(int i=0; i<k;i++)
        {            
            for(int j=0; j<k;j++)
            {
                arr[i][j]=sc.nextInt();
            }
         }

         int sum =0;
         for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (i==j) {
                    sum+= arr[i][j];
                }
            }
         }
         System.out.println(sum);
    }
}
