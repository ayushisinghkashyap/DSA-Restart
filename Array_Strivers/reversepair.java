import java.util.Scanner;

public class reversepair {
    public static int reversePairs(int[] nums) {
        int count =0;
        for(int i=0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                if(i<j && (long)nums[i] > 2L * (long)nums[j]){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {

        // int arr[] = {1,3,2,3,1};
        // int arr[] = {2,4,3,5,1};
        // int arr[] = {2147483647,2147483647,2147483647,2147483647,2147483647,2147483647};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(reversePairs(arr));
    }
}
