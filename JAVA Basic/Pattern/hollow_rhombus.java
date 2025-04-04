package Pattern;

import java.util.Scanner;

public class hollow_rhombus {
    public static void HollowRhombus(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n-i; j >0; j--) {
                System.out.print(" ");
            }
            if(i==1||i==n){
                for (int j = 1; j <=n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for (int j = 1; j <= 1; j++) {
                    System.out.print("*");
                }
                for (int j = 1; j <= n-2; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        HollowRhombus(n);
    }
}
