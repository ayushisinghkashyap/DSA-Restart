public class subarrays {
    public static void print_Subarrays(int arr[]){
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<=i;j++){
                System.out.print(arr[j] + "");
            }
            System.out.println();
        }
    }
    //not done yet

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        print_Subarrays(arr);
    }
}
