public class countnum {
    public static void CountNum(int arr[][], int num){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(num == arr[i][j]){
                    count++;
                }
            }
        }
        System.out.println(num+" appears "+count+" times");
    }

    public static void main(String[] args) {
        int arr[][] = {{1,7,3},{4,7,7},{7,8,9}};
        int num =7;
        CountNum(arr, num);
    }
}
