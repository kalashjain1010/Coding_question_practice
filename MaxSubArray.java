public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = { -10, -2000, -30, -40, -50 };
        int sum = 0;
        int ans = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            sum+=nums[i];
            ans =Math.max(ans, sum);
            if (sum < 0) {
                sum=0;
            }
        }
        System.out.println(ans);
    }
}
