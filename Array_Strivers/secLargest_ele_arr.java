import java.util.Scanner;

public class secLargest_ele_arr {
    public static int SecondLargestElement(int arr[]){
        int max=0;
        int secMax = 0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i] != max){
                if(secMax<arr[i]){
                    secMax = arr[i];
                }
            }
        }
        return secMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array : ");
        int n = sc.nextInt();
        int[] arr= new int[n];
        System.out.println("Elements of array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Second Largest Element : ");
        System.out.print(SecondLargestElement(arr));
    }
}

