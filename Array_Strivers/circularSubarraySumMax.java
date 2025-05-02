public class circularSubarraySumMax {
    public static int circularSubarraySum(int arr[]) {
        int maxsum = Integer.MIN_VALUE;
        int sum = 0;
        int count = 1;
        int poss = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                poss = 1;
                break;
            }
            maxsum = Math.max(sum,maxsum);
        }
        
        if(poss == 1){
            for(int i=0;i<arr.length;i++){
                sum += arr[i];
                
                if(sum<0){
                    sum =0;
                }
                maxsum = Math.max(sum,maxsum);
                
                if(count == 2 && i == arr.length - 2){
                    break;
                }
                
                if(i==arr.length-1){
                    i=-1;
                    count++;
                    if(count ==3){
                        break;
                    }
                }
                
            }
        }
        return maxsum;
    }

    public static void main(String[] args) {
        int arr[] = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(circularSubarraySum(arr));
    }
}
