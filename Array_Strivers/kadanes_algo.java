import java.util.Scanner;

public class kadanes_algo {
    public static int maxSubarraySum(int arr[],int n){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        int poss = 0;

        for (int i = 0; i < n; i++) {   //if all elements of an array is negative
            if(arr[i]>0){
                poss = 1;
                break;    // if a single element is greater than 0 then loop stops 
            }
            else{
                maxSum = Math.max(maxSum, arr[i]);
            }
        }

        if(poss == 1){
            for (int i = 0; i < n; i++) {
                currSum += arr[i];

                if(currSum<0){
                    currSum = 0;
                }

                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        // int arr[] = {-2,-3,4,-1,-2,1,5,-3};
        // //int arr[] = {-2,-3,-4,-1,-2,-1,-5,-3};   // max negative sum
        // int n = 8;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array :");
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        System.out.println(maxSubarraySum(arr, n));
    }
}
