import java.util.Arrays;
import java.util.Scanner;

public class majorityNby3 {
    public static int majorityElement(int[] nums) {
        int count = 1;
        int n = nums.length;
        int num = 0;
        if(n == 1){
            num = nums[0];
        }
        else{
            Arrays.sort(nums);
        
            for(int i=1;i<nums.length;i++){
                if(nums[i] == nums[i-1]){
                    count++;
                }
                if(count>n/2){
                    num = nums[i];
                    break;
                }
                else if(nums[i] != nums[i-1]){
                    count = 1;
                }
            }
        }

        return num;
    }

    public static void main(String[] args) {
        //int arr[] = {3,2,3};
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(majorityElement(arr));
    }
}
