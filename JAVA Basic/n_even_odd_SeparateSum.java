import java.util.Scanner;

public class n_even_odd_SeparateSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;

        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                evenSum+=i;
            }
            else{
                oddSum+=i;
            }
        }

        System.out.println("Sum of Even Numbers: "+evenSum);
        System.out.println("Sum of Odd Numbers: "+oddSum);
    }
}
