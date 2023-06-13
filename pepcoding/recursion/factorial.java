// package pepcoding.recursion;

public class factorial {
    public static void main(String[] args) {
        int n=3;
        // pdi(n);
        int f = pdi(n);
        System.out.println(f);
        
    }

    public static int pdi(int n){
        if (n==1) {
            return 1;
        }
        int fm1= pdi(n-1);
        int fact= n*fm1;
        
        return fact;
    }
}
