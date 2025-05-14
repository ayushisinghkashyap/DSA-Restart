import java.util.Scanner;

public class evenOdd {
    public static void checkEvenOdd(int n){
        int num = n & 1;
        if(num == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }

    public static void main(String[] args) {
        // int n = 24;
        // int n1 = 21;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        checkEvenOdd(n);
    }
}
