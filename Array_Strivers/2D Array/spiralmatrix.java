public class spiralmatrix {

    public static void SpiralMatrix(int mat[][], int n,int m){

        int sr = 0;
        int er = n-1;
        int sc = 0;
        int ec = m-1;

        while(sr<=er && sc<=ec){

            for(int i = sc;i<=ec;i++){
                System.out.print(mat[sr][i]+" ");
            }
    
            for (int i = sr+1; i <=er; i++) {
                System.out.print(mat[i][ec]+" ");
            }
          
            for (int i = ec-1; i >=sc ; i--) {
                System.out.print(mat[er][i]+" ");
            }
            
            for (int i = er-1; i >= sr+1; i--) {
                System.out.print(mat[i][sc]+" ");
            }
            sr++;
            er--;
            sc++;
            ec--;

            System.out.println();
        }
    }

    public static void main(String[] args) {
        int mat[][] = {{1,2,3,4,67},
                        {5,6,7,8,89},
                        {9,10,11,12,78},
                        {13,14,15,16,67},
                    {17,18,19,20,34}};
        SpiralMatrix(mat, 5, 5);
    }
}