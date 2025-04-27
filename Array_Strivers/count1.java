import java.util.Scanner;

public class count1 {
    public static int maxConsequtiveOne(int arr[]){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        if(sum >0){
            int count = 1;
        int maxcount = 1;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] == arr[i-1] && arr[i-1] == 1){
                count++;
                maxcount = Math.max(count, maxcount);
            }
            else{
                count = 1;
            }
        }
        return maxcount;
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(maxConsequtiveOne(arr));
    }
}
