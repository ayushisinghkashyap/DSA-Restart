public class rotate {
    public static void rotate90matrix(int arr[][]){
        int n = arr.length;
        int rotatearr[][] = new int[n][n];
        int k =0;
        for (int i = n-1; i >=0; i--) {
            for (int j = 0; j < arr.length; j++) {
                rotatearr[j][k] = arr[i][j];
                
            }
            k++;
        }
        for (int i = 0; i <n; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(rotatearr[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Actual Matrix: ");
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("90 degree Rotated Matrix: ");
        rotate90matrix(arr);
    }
}
