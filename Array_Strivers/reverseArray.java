import java.util.Scanner;

public class reverseArray {
    public static void reverse(int arr[]){
        int first = 0, last = arr.length-1;

        while(first<last) {

            int temp = arr[last];
            arr[last] = arr[first];
            arr[first] = temp;
            first++;
            last--;
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        //int arr[] = {2,3,4,5,6,7,8};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        reverse(arr);
    }
}
