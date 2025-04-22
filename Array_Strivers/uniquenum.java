import java.util.Arrays;

public class uniquenum {
    public static int uniqueNum(int arr[]){
        Arrays.sort(arr);
        int num = 0;
        for(int i =0;i<arr.length-1;i++){
            if(arr[i] == arr[i+1]){
                i++;
            }
            else{
                num = arr[i];
                break;
            }
        }
        return num;
    }

    public static void main(String[] args) {
        int arr[] = {2, 30, 2, 15, 20, 30, 15};
        System.out.println(uniqueNum(arr));
    }
}
