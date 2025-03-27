package Pattern;

import java.util.Scanner;

public class halfpyramid {
    public static void HalfPyramid(int n){
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i-1 ; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number lines : ");
        int n = sc.nextInt();
        HalfPyramid(n);
    }
}
