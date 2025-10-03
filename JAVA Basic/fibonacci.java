import java.util.Scanner;

public class fibonacci {

    public static void printFibonacci(int n){
        if (n==0){
            System.out.print(n);
        }
        else{
            int f1 = 0;
            int f2 = 1;
            System.out.print(f1+" "+f2);
            while(n>2){
                int f3 = f1 + f2;
                System.out.print(" "+f3);
                f1 = f2;
                f2 = f3;
                n--;
            }
        }
    }

    public static void Naive_approach(int n){
        if (n==0){
            System.out.print(n);
        }
        else{
            int fibo[] = new int[n+1];
            fibo[0] = 0;
            fibo[1] = 1;
            for (int i = 2; i < n; i++) {
                fibo[i] = fibo[i-2] + fibo[i-1];
            }

            for (int i = 0; i < n; i++) {
                System.out.print(fibo[i]+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        printFibonacci(n);
        System.out.println();
        System.out.print("Naive Approach : ");
        Naive_approach(n);

        sc.close();
    }
}