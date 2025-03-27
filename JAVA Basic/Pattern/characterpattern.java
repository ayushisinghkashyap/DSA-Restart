package Pattern;

import java.util.Scanner;

public class characterpattern {
    public static void charPattern1(int n){
        
        for (int i = 0; i < n; i++) {
            char letter = 'A';
            for (int j = 0; j < i; j++) {
                System.out.print(letter+" ");
                letter++;
            }
            System.out.println();
        }
    }
    public static void charPattern2(int n){
        char letter = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(letter+" ");
                letter++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number lines : ");
        int n = sc.nextInt();
        charPattern1(n);
        charPattern2(n);
    }
}
