//leetcode 26

public class removeDuplicate {
    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,3,4,5,9,6};

        int j=0;
      int n = nums.length;

      for(int i =0;i<n; i++){
          if(nums[j]!=nums[i]){
              j++;
              nums[j]=nums[i];
          }
      } 
      System.out.println(j+1);
    }
}
