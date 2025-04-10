import java.util.Scanner;

public class selection_sort {
    public static void SelectionSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int minpos = i;
            for (int j = i; j < arr.length; j++) {
                if(arr[minpos]>arr[j]){
                    minpos = j;
                }
            }

            //swap
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2};
        // SelectionSort(arr);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elemnts : ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Sorted : ");
        SelectionSort(arr);
    }
}
