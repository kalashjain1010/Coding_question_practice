// package tcs;
import java.util.*;
import java.lang.Math;

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
         //com

         int sum =0;
         for (int i = 0; i < k; i++) {
            for (int j = 0; j < k; j++) {
                if (i==j) {
                    sum+= arr[i][j];
                }
            }
         } 

         int sum2 =0;
         for (int i = 0; i < k; i++) {
            for (int j = k-1; j >= 0; j--) {
                if ((i + j) == (k - 1)){

                    sum2+= arr[i][j];  
                }
            }
         }

         System.out.println(sum);
         System.out.println(sum2);
       
            System.out.println("-----------------------------");
         System.out.println(Math.abs(sum-sum2));
         
    }
}
