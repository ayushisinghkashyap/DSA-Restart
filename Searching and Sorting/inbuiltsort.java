import java.util.*;
public class inbuiltsort {
    public static void main(String[] args){
        int arr[] = {5,4,6,8,2};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }

        System.out.println("Using index");
        
        int arr1[] = {5,4,6,8,2,9};
        Arrays.sort(arr1,2,5);
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]+" ");
        }
    }
}
