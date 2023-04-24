// lleetcode 268. Missing Number

public class missingNumber {
    public static void main(String[] args) {
        int nums[] = {9,6,4,2,3,5,7,0,1};

        System.out.println(missingNum(nums));
    }
    public static int missingNum(int[] nums) {
        int sum=0;
        for (int i = 0; i < nums.length; i++) {
            sum=sum+nums[i];
        }

        int sumAct =(nums.length* (nums.length+1))/2;

        int ans = sumAct - sum;

        return ans;
    }
}
