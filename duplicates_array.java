import java.util.Scanner;

public class duplicates_array {
    public static int RemoveDuplicatesInArray(int arr[]){
        int j = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[j] != arr[i]){
                j++;
                arr[j] = arr[i];
            }
        }
        return j+1;
    }

    public static void main(String[] args) {
        int arr[] = {2,2,3,4,5,5,6};
        int k = RemoveDuplicatesInArray(arr);
        for(int i=0;i<k;i++){
            System.out.println(arr[i]);
        }
    }
}
