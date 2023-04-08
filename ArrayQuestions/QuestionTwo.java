import java.util.Arrays;

public class QuestionTwo {
    public static void main(String[] args) {
      System.out.println('t'-'a');
    }
    static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int smaller=0;
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    smaller++;
                }
            }
            ans[i]=smaller;
        }
        return ans;
    }
}
