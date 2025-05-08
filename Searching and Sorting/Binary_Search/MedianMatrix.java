package Binary_Search;

public class MedianMatrix {
    public static int median(int mat[][]){
        int i = mat.length;
        int j = mat[0].length;

        int medi = i/2 , medj = j/2;
        return mat[medi][medj];
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,4,9},{2,5,6},{3,8,7}};
        System.out.print("Median : "+ median(matrix));
    }
}
