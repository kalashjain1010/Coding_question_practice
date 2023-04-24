// 136. Single Number

public class singleNumber {
    
    public static void main(String[] args) {
        
        int xor=0;
        int[] nums ={4,1,2,1,2,4,6};

        for (int i : nums) {
            xor = xor^i;
        }
        System.out.println(xor);
    }


}
