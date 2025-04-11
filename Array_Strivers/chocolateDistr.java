import java.util.Arrays;
import java.util.Scanner;

public class chocolateDistr {
    
    public static void chocolateDistribution(int m,int arr[]){
        int mindiff = Integer.MAX_VALUE;
        Arrays.sort(arr);
    
        for (int i = 0; i < arr.length-m ; i++) {
            mindiff = Math.min(mindiff,arr[i+m-1]-arr[i]);
            
        }

        System.out.println(mindiff);
    }

    public static void main(String[] args) {
        // test case
        // int arr[] = {7, 3, 2, 4, 9, 12, 56}, m = 3 ;
        // chocolateDistribution(m, arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Number of student: ");
        int m = sc.nextInt();
        System.out.print("Enter length of array :");
        int n = sc.nextInt();
        System.out.println("Enter elements of array: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        chocolateDistribution(m, arr);
    }
}
