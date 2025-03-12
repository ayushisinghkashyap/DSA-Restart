import java.util.Scanner;

public class largest_ele_array {

    public static int LargestElement(int arr[]){
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
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
        System.out.println("Largest element : ");
        System.out.print(LargestElement(arr));
    }
}