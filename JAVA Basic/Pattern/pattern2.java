package Pattern;

public class pattern2 {
    public static void Pattern(int n){
        // int d = 1;
        // for (int i = 2; i <= n; i++) {
        //     if(i%2!=0){
        //         d += 1;
        //     }
        // }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if(i==1||i==n||j==1||j==n){
                    System.out.print(3);
                }
                else if(i==2||i==n-1||j==2||j==n-1){
                    System.out.print(2);
                }
                else if(i==j){
                    System.out.print(1);
                }
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Pattern(5);
    }
}
