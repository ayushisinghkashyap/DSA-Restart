public class diagSum {
    public static void DiagonalSum(int arr[][]){
        int totalsum =0;
        int diagsum = 0;
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                totalsum = totalsum + arr[i][j];
                if(i==j){
                    diagsum += arr[i][j];
                }
            }
        }
        System.out.println("Total Sum: "+totalsum);
        System.out.println("Diagonal Sum: "+diagsum);
    }
    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        DiagonalSum(arr);
    }
}
