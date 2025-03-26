public class bruteForce_Maxsum {
    public static void subarrySum(int arr[]){
        int maxsum =0;
        for (int i = 0; i < arr.length; i++) {
            int start =i;
            for (int j = i; j < arr.length; j++) {
                int end =j;
                int currsum=0;
                for (int k = start; k <= end; k++) {  // this will print subarrays from start to end  
                    System.out.print(arr[k]+" ");  // print SubArrays
                    currsum = arr[k]+currsum;   // Calculating Sum of sub Arrays 
                }
                if(maxsum<currsum){
                    maxsum=currsum; // assigning maximum sum to the MaxSum
                }
                System.out.print("  sum: "+currsum);   // print a subarray Sum
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Maximum Sum : "+maxsum);   // print Maximum sum
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        subarrySum(arr);


        // time complexities is O(n^3)  which is worst 
        // this approach is called Brute Force
        // another best approch with less time complexities is prefix sum
    }
    
}
