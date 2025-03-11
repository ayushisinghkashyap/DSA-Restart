import java.util.Scanner;

public class sort_array {
    public static boolean IsArraySorted(int arr[]){
        for (int i=0;i<arr.length;i++){
            if((arr[i]<arr[i+1]) || (arr[i]>arr[i+1])){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array :");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Enter the elements of array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt(); 
        }
        boolean a = IsArraySorted(arr);
        if(a == true){
            System.out.println("Array is sorted.");
        }
        else{
            System.out.println("Array is not sorted");
        }
    }
}
