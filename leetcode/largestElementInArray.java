import java.util.*;

public class largestElementInArray {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("length of arr:");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("enter an array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max)
                max = arr[i];
        }
        sc.close();
        System.out.println(max);
       
    }
}