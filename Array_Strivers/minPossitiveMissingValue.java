import java.util.Arrays;

public class minPossitiveMissingValue {
    public static int missingNumber(int[] arr) {
        // Your code here
        Arrays.sort(arr);
        int poss = Integer.MAX_VALUE;
        for(int i =1;i<arr.length-1;i++){
            if(arr[i] >= 0){
                int temp = arr[i] +1;
                if(arr[i] != arr[i+1]){
                    if(temp != arr[i+1]){
                        poss = Math.min(poss,temp);
                    }
                }
            }
        }
        return poss;
    }
    public static void main(String[] args) {
        int arr[] = {2, -3, 4, 1, 1, 7};
       // int arr[] = {5, 3, 2, 5, 1};
       // int arr[] = {-8, 0, -1, -4, -3};  // not working for this case
       
       System.out.println(missingNumber(arr));
    }
}
