package Binary_Search;

import java.util.Scanner;

public class binarysearch {
    public static int search(int arr[], int key){
        int start = 0;
        int end = arr.length - 1;
        int index = -1;
        while(start < end){
            int mid = (start + end)/2;
            if(arr[mid] == key){
                index = mid+1 ;
                break;
            }
            else if(arr[mid] < key){
                end = mid-1;
            }
            else if(arr[mid] > key){
                start = mid+1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        // int arr[] = {5,4,1,3,2};
        // int key = 6;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elemnts : ");
        int n = sc.nextInt();
        System.out.println("Enter elements: ");
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key: ");
        int key = sc.nextInt();

        System.out.println(search(arr, key));        
    }
}
