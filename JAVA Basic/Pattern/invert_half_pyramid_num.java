package Pattern;

import java.util.Scanner;

public class invert_half_pyramid_num {

    public static void Invert_half_pyramid_num(int n ){
        for (int i = n; i >0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void half_pyramid_num(int n){
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Invert_half_pyramid_num(n);
        half_pyramid_num(n);
    }
}
