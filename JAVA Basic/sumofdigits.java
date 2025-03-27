import java.util.*;

public class sumofdigits {
    public static int SumOfDigits(int num){
        int sum = 0;
        while(num > 0){
            int rem = num % 10;
            sum = sum + rem;
            num = num/10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Sum of digits: "+SumOfDigits(num));
    }
}
