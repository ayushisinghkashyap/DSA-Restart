import java.util.Scanner;

public class APmisingNum {
    public static int findMissing(int[] arr) {
        // code here
        int num = 0;
        int diff = arr[1] - arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]+diff != arr[i]){
                num = arr[i-1]+diff;
                break;
            }
        }
        
        if(num == 0){
            num = arr[arr.length-1]+diff;
            return num;
        }
        else{
            return num;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Missing num: "+findMissing(arr));
    }
}
