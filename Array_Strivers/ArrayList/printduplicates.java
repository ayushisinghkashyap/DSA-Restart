import java.util.ArrayList;
import java.util.Arrays;

public class printduplicates {
    public static ArrayList<Integer> findDuplicates(int[] arr) {
        ArrayList<Integer> num = new ArrayList<>();
        Arrays.sort(arr);
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                num.add(arr[i]);
                i++;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int arr[] = {1};
        System.out.println(findDuplicates(arr));
    }
}
