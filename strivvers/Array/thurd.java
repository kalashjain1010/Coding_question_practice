
import java.util.*;

public class thurd {
    public static void main(String[] args) {
        int[] arr= {631,2,1,32,223};

        // Arrays.sort(arr);
        // int small=0;
        // int lg=0;
        // for (int i = 0; i < arr.length; i++) {
        //     small=arr[1];
        //     lg=arr[arr.length-2];
        // }
        // System.out.println(small +" " + lg);
        System.out.println(secondSmallest(arr));
    }

    static private int secondSmallest(int[] arr){
            int sm=Integer.MAX_VALUE;
            int sm2 = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i]<sm && arr[i]<sm2) {  
                    sm2=sm;
                    sm=arr[i];
                    
                }
                
                else if(arr[i] < sm2 && arr[i] != sm){
                    sm2=arr[i];
                }
            }
            return sm2;
    }
}
