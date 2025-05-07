import java.util.Scanner;

public class countInversion {
    public static int CountInversion(int arr[]){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5};
        //int arr[] = {5,4,3,2,1};
        //int arr[] = {1,2,4,3,5};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Number of inversion: "+CountInversion(arr));

    }
}
