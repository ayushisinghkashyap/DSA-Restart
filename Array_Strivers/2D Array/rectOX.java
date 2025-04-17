import java.util.Scanner;

public class rectOX {
    public static void rectangleOX(int n,int m){
        char arr[][] = new char[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==arr.length-1 || i==0 || j==arr[0].length-1 || j==0){
                    arr[i][j] = 'X';
                }
                else{
                    arr[i][j] = 'O';
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // int n = 4, m = 5;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        rectangleOX(n,m);
    }

}
