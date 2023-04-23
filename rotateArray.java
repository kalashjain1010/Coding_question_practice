import java.util.*;

public class rotateArray {

    public void rotate(int[] arr, int k) {
        
        k=k%arr.length;
        int i=arr.length-k;

        reverse(arr,i,arr.length-1);
        
        reverse(arr,0,i-1);
        
        reverse(arr,0,arr.length-1);
    }
   public static void reverse(int [] arr,int i, int j)
	{
		while(i < j)
		{
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
	    	}
    }
    
    public static void main(String[] args) {
       int arr[] = {1 , 2 ,34 ,5 ,55 };
        
    }
}
