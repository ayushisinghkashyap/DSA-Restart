public class subarrayLTC3392 {
    public static int countSubarrays(int[] nums) {
        int s = 0;
        int e = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            s = i;
            for (int j = i; j < nums.length; j++) {
                e = j;
                if(Math.abs(s-j)==2){
                    int sum = nums[s] + nums[e];
                    if(s < nums.length && sum*2 == nums[s+1]){
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {-1,-4,-1,4};
        System.out.println(countSubarrays(arr));
    }
}
