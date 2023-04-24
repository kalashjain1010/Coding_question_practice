import java.util.*;
public class CheckSortedArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("length of arr:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter an array"); 
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int yes=0;
        for (int i = 0; i < n-1; i++) {
            if( arr[i]<arr[i+1] ){
                yes=1;
            }
            else{
                yes=0;
            }

        }
        if (yes==1) {
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
}