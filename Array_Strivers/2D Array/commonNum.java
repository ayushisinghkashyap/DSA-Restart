public class commonNum {
    public static int CommonNum(int arr[][]){
        int cnum = 0 , k =0 ;
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(arr[0][k] == arr[i][j]){
                    cnum = arr[i][k];
                }
            }
            k++;
        }

        return cnum;
    }

    public static void main(String[] args) {
        int mat[][] = {
            { 9, 2, 5, 4 },
            { 2, 0, 5, 8 },
            { 3, 5, 7, 9 },
            { 1, 3, 5, 7},
        };

        System.out.println(CommonNum(mat));
    }
}
