// 485. Max Consecutive Ones


public class maxConsecutiveOnes {
    public static void main(String[] args) {
        int nums[] ={1,1,1,1,1,1,0,1,1,1,1,1,1,1,1,1,0,1};
        System.out.println(number(nums));
    }

    public static int number(int[] nums) {
        int count=0;
        int sum =0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]==1) {
                count++;
                
                if (sum<count) {
                    
                    sum=count;
                }
            }
            else if (nums[i]==0) {
                count=0;
            }
        }
        return sum;
    }
}
