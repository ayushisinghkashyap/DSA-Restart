import java.util.Scanner;

public class countsort {
    public static void Countsort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest,arr[i]);
        }

        int count[] = new int[largest];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]-1]++;
        }
        
        int j =0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]>0){
                arr[j] = i+1;
                j++;
                count[i]--;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        // int arr[] = {1,4,2,3,2,5,6,7,3};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elemnts : ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Sorted : ");
        Countsort(arr);
    }
}
