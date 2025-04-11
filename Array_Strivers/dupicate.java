import java.util.Arrays;
import java.util.Scanner;

public class dupicate {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        boolean count = false;
        for(int i =0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                count= true;
                break;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        // test case 
        // int arr[] = {1,2,3,1};
        // int arr[] = {1,4,6,8,0};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :");
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(containsDuplicate(arr));
    }
}
