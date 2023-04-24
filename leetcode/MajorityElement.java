//leetcode 169. Majority Element

public class MajorityElement {
    public static void main(String[] args) {

        int nums[]={1,1,2,1,2,1,2,1,1,2,2,2,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,33,3,3,3,3,3,3,3,3,3,2,2,3,3,3,2,5,5,5,5,4,3,3};
        int count =0;
        int ans =0;
            for(int num:nums){
                if( count ==0){
                    ans =num;
                }
                if(num==ans) count +=1;
                else count-=1;
            }
            System.out.println(ans);
    }
}
