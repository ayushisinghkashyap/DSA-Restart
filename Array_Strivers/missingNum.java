import java.util.Scanner;

public class missingNum {
    public static int checkMissingNum(int arr[] , int n){
        int sum = n*(n+1)/2;
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }
        int num = Math.abs(sum - arrSum);
        System.out.print("Missing Number is ");
        return num;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(checkMissingNum(arr, n));
    }
}
