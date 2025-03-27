import java.util.Scanner;

public class prime_optimize {
    public static String optimize_approach(int num){ // num = 16
        int count = 0;
        for (int i = 2; i <= Math.sqrt(num) ; i++) { // sqrt(16) = 4

            /*  if number is devisible by 2 then it will also devisible by 4 and 8 
            and no need to check for these numbers . So this approach repeating factors of a number */

            if(num%i != 0){
                count = 1;
            }
            else{
                count = 0;
            }
        }

        if(count == 1){
            return "Prime NUmber";
        }
        return "Not prime Number";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        System.out.println("Answer: "+optimize_approach(n));
    }
}
