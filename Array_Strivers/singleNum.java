import java.util.ArrayList;

public class singleNum {
    public static void checksingleNum(int[] arr) {
        ArrayList <Integer> num = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                num.add(arr[i]);
            }
        }
        int[] num2 = num.stream().mapToInt(i -> i).toArray();
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,2};
        checksingleNum(arr);
    }
}
