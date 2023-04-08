// leetcode 283

public class moveZeros {
    public static void main(String[] args) {
        int nums[] ={0,1,2,0,3};
        
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]!=0){
                nums[count++]=nums[i];
            }
        }
        while (count<nums.length) {
            nums[count++]=0;
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.println(nums[j]);
        }
    }

}
