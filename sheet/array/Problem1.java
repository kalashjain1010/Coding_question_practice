//in this i have to reverse the string

import java.util.*;


public class Problem1{
    static String reverse(String s){
        int n = s.length();
        if(n==0){
            return "";
        }
        return (s.charAt(n-1) + reverse(s.substring(0, n-1)) );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s));
        
    }
    
}