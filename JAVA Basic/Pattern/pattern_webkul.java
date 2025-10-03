package Pattern;
import java.util.Scanner;

public class pattern_webkul {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an odd number greater than 1: ");
        int n = sc.nextInt();

        if (n <= 1 || n % 2 == 0) {
            System.out.println("Please enter an odd number greater than 1.");
            return;
        }

        // Top Pyramid
        int space = ((n+1)/2) - 1;
        int s = space;
        for (int i = 0; i <= space; i++) {
            for(int j=n+s-1;j>=0;j--){
                System.out.print(" ");
            }
            s--;
            for(int j=0;j<i*2 +1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Middle @ Columns
        for (int i = 1; i < n-1; i++) {
             
            for(int j=0;j<n;j++){
                System.out.print(" ");
            }
            System.out.print("@");
            for(int j=0;j<n-2;j++){
                System.out.print(" ");
            }
            System.out.print("@");
            System.out.println();
        }


        // Bottom inverted pyramids with @ 
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.print("@");
        for(int i=0;i<n-2;i++){
            System.out.print(" ");
        }
        System.out.print("@");
        for(int i=0;i<n;i++){
            System.out.print("*");
        }
        System.out.println();

        invTriangle(n, space);
        
    }


    private static void invTriangle(int n,int space) {
        int s = space;
        for(int i=1;i<=space;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(s*2)-1;j++){
                System.out.print("*");
            }

            for (int j = 1; j <= n + (i*2); j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(s*2) -1;j++){
                System.out.print("*");  
            }
            s--;
            System.out.println();
        }
    }
}

