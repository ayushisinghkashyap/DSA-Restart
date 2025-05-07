import java.util.Arrays;

public class majorityNby2 {
     public static int majorityElement(int[] nums) {
        int count = 1;
        int n = nums.length;
        int num = 0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                count++;
            }
            if(count>n/2){
                num = nums[i+1];
                break;
            }
            else if(nums[i] != nums[i+1] ){
                count = 1;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        int arr[] = {3,2,3};
        System.out.println(majorityElement(arr));
    }
}
