package ArrayList;
import java.util.ArrayList;

public class pushZero {
    public static void pushZerosToEnd(int[] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        int count = 0;
        for(int i =0;i<arr.length;i++){
            if(temp.contains(arr[i]) == false && arr[i]>0){
                temp.add(arr[i]);
            }
            if(arr[i] == 0){
                count++;
            }
        }
        if(count>0){
            for(int i =0;i<count;i++){
                temp.add(0);
            }
        }
        for(int i:temp){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] ={3,5,0,0,3,5,4,0};
        pushZerosToEnd(arr);
    }
}
