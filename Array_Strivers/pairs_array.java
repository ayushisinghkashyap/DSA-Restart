public class pairs_array {
    public static void print_pairs(int arr[]){
        int totalpairs = 0;
        for(int i = 0;i<arr.length;i++){
            int curr = arr[i];
            for(int j = i+1;j<arr.length;j++){
                System.out.print("(" + curr + "," + arr[j] + ")");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs : " + totalpairs); 
        // Total pairs = (n(n-1))/2 , n = arr.length
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        print_pairs(arr);
    }
}
