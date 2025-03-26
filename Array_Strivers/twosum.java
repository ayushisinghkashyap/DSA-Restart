public class twosum {
    public static String twosumcheck(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    return "yes";
                }
            }
        }
        return "No";
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        int target = 14;
        System.out.println(twosumcheck(arr, target));
    }
}
