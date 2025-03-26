import java.util.Scanner;

public class odd_even_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = sc.nextInt();

        if(a%2==0){
            System.out.println("even Number");
        }
        else{
            System.out.println("Odd number");
        }

        // using ternary operator to check whether the number is odd or even
        String result = (a%2==0)? "even" : "odd";
        System.out.println(result);
    }
}
