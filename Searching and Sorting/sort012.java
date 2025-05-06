import java.util.Scanner;

public class sort012 {
    public static void sortColors(int[] nums) {
        int j0=0,j1=0,j2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0){
                j0++;
            }
            else if(nums[i] == 1){
                j1++;
            }
            else if(nums[i] == 2){
                j2++;
            }
        }

        int j=0;
        while(j0>0){
            nums[j] = 0;
            j++;
            j0--;
        }
        while(j1>0){
            nums[j] = 1;
            j++;
            j1--;
        }
        while(j2>0){
            nums[j] = 2;
            j++;
            j2--;
        }
        
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }        
    }

    public static void main(String[] args) {
        // int arr[] = {0,1,2,2,2,1,0,1,0,1};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elemnts : ");
        int n = sc.nextInt();
        System.out.println("Enter elements(0,1,2): ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Sorted : ");
        
        sortColors(arr);
    }
}
