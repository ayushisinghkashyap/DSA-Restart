package Binary_Search;

import java.util.Scanner;

public class onceOccur {

    public static int occur(int nums[]){
        int num =0;
        int s = 0;
        int e = nums.length -1;
        if(nums.length == 1){
            return nums[0];
        }
        else{
            while (s < e){
                if(nums[s] == nums[s+1] && s%2 == 0){
                    s += 2;
                } 
                if(nums[e] == nums[e-1] && e%2 == 0){
                    e -= 2;
                } 
                if(s<nums.length -2 && nums[s] != nums[s+1] ){
                    num = nums[s];
                    break;
                } 
                if(nums[e] != nums[e-1]){
                    num = nums[e];
                    break;
                }       
            }

            return num;
        }
    }

    public static void main(String[] args) {
        // int arr[] = {1,1,2,2,3,3,4,5,5,6,6};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elemnts : ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(occur(arr));
    }
}