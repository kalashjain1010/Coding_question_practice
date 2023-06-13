// package pepcoding.recursion;

public class power {
    public static void main(String[] args) {
        int n =2;
        int k = 2;
        int ans= pw(n,k);
        System.out.println(ans);
    }

    public static int pw(int n, int k){
        if(k==0 ){
            return 1;
        }
        int p = pw(n,k-1);
        int ans = n* p;
        
        return ans;
    }
}
