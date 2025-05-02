public class maxprodSubarray {
    public static int maxProduct(int[] arr) {
        // code here
        int maxp = Integer.MIN_VALUE;
        int curr = 1;
        int k =0;
        int j =0;
        for(int i =0;i<arr.length;i++){
            curr *= arr[i];
            maxp = Math.max(maxp,curr);
            if(arr[i] < 0){
                j++;
            }
            if(arr[i] == 0){
                curr =1;
            }
        }
        if(j%2 != 0){
            j=0;
            curr = 1;
            maxp = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                curr *= arr[i];
                maxp = Math.max(maxp,curr);
                if(curr < 0){
                    j++;
                }
                
                else if(curr == 0){
                    curr = 1;
                }
                
                if(j >=2){
                    int rlast = curr/arr[i];
                    int rfirst = curr/arr[k];
                    maxp = Math.max(rlast,rfirst);
                    curr = maxp;
                    k++;
                    j=0;
                    if(maxp == rlast){
                        curr = 1;
                    }
                }
            }
        }
        return maxp;
    }

    public static void main(String[] args) {
        int arr[] = {1, -7, 4, 7, 3, 4, 7, -3, -3, 3, -10, 9, 10, 
            -4, -1, -1, 0, -5, 8, 5, 1, -7, -6, -7, 1, -7, 0, 9, 4,
             -8, 7, -6, 7, 6, 8, -4, 2, -3, 9, 2, 0, 10, -1, -9, -3, 9, 7,
              -1, -9, 8, -8, 10, 2, 5, -1, 2, 1, 0, -9, -7, -9, -1, 8, -3, -3, 9, 
              -7, 4, 10, 7, 1, -1, -2, 1, 0, 4, 8, 7, 9, -9, 3, -3, -2, -1, 7, 0
        };
        System.out.println(maxProduct(arr));
    }
}
