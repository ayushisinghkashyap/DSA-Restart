public class subarrDivByK {

    public static int LongestSubarrayDivByK(int arr[], int K){
        int maxl = 0;
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sum = (sum + arr[j]) % K;
                if (sum ==0){
                    maxl = Math.max(maxl,j-i+1);
                }
            }
        }
        return maxl;
    }

    public static void main(String[] args) {
        int[] arr = {2, 7, 6, 1, 4, 5};
        int k = 3;
        System.out.println(LongestSubarrayDivByK(arr, k));
    }
}