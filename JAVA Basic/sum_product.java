import java.util.Scanner;
public class sum_product {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        int sum = a+b;
        int prod = a*b;
        System.out.println("Sum :"+sum);
        System.out.println("Product :"+prod);


    }
}