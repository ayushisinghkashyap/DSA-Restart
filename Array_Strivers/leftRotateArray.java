import java.util.Scanner;

public class leftRotateArray {
    public static void LeftRotateArray(int arr[]){
        int n = arr.length;
        int tarr[] = new int[arr.length];
        for(int i = 0;i<arr.length-1;i++){
            tarr[i] = arr[i+1];
        }
        tarr[n-1] = arr[0];

        for(int i = 0;i<n;i++){
            System.out.print(tarr[i]+" ");
        }
    }

    public static void main(String[] args) {
        //int arr[] = {1,2,3,4,5,6};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        LeftRotateArray(arr);
    }
}
