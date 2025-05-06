import java.util.Scanner;

public class insertion_sort {
    public static void InsertionSort(int[] arr,int n){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j >0; j--) {
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    System.out.println("end");
                    break;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        // int n = 5;
        // int arr[] = {5,4,1,3,2};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elemnts : ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Sorted : ");
        InsertionSort(arr, n);
    }
}