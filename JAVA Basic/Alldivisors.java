import java.util.Scanner;

public class Alldivisors {
    public static void printAllDivisors(int num){
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int num = sc.nextInt();
        System.out.print("Divisors of " + num + " are: ");
        printAllDivisors(num);
    }
}
