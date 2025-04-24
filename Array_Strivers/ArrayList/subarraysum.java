import java.util.ArrayList;

public class subarraysum {
    public static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> num = new ArrayList<>();
        int sum =0;
        int j =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i] == target){
                num.add(i+1);
                num.add(i+1);
                break;
            }
            else{
                sum +=arr[i];
                if(sum >target){
                    sum -= arr[j];
                    j++;
                }
                if(sum == target){
                    num.add(j+1);
                    num.add(i+1);
                    break;
                }
            }
        }
        if(num.isEmpty()){
            num.add(-1);
            return num;
        }
        return num;
    }



    public static void main(String[] args) {
        int arr[] = {19,23,15,6,6,2,28,2};
        int target = 1;
        System.out.println(subarraySum(arr, target));
    }


    // another optimized approach
    
    // public static ArrayList<Integer> subarraySum(int[] arr, int target) {
    //     ArrayList<Integer> num = new ArrayList<>();
    //     int sum =0;
    //     int j =0;
    //     for(int i =0;i<arr.length;i++){
    //         sum += arr[i];
    //         while(sum>target && j < i){
    //             sum -= arr[j++];
    //         }
    //             if(sum == target){
    //                 num.add(j+1);
    //                 num.add(i+1);
    //                 break;
    //             }
    //     }
        
    //     if(num.isEmpty()){
    //         num.add(-1);
    //         return num;
    //     }
    //     return num;
    // }
}
