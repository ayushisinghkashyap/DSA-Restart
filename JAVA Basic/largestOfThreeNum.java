import java.util.Scanner;

public class largestOfThreeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        if((a>b) && (a>c)){
            System.out.println("Largest is "+a);
        }
        else if((b>a) && (b>c)){
            System.out.println("Largest is "+b);
        }
        else{
            System.out.println("Largest is "+c);
        }


        // using ternary operator to check which the number is larger between two number
        int result = (a>b)? a : b;
        System.out.println("Largest is "+result);

    }
}
