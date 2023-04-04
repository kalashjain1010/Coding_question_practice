//leetcode ques no. 1021
import java.util.*;
 

public class removeOutermostParenthesis {


    public static String removeParen(String s){
        int count = 0;
        StringBuilder str = new StringBuilder();

        for(int i = 0; i<s.length(); i++){
            if( s.charAt(i) == '('){
                count++;
                if(count>=2) str.append('(');
            }else {
                if(count>=2) str.append(')');
                count--;
            }
        }

        return str.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter paranthesis  ( , )");
        String result = removeParen(sc.nextLine());
        
        System.out.println("result is " + result);

    }
}
