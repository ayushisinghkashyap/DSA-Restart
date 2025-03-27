import java.util.Scanner;

public class prime_range {
    
    public static boolean optimize_approach(int num){
        for (int i = 2; i <= Math.sqrt(num) ; i++) {

            if(num%i == 0){
                return false;
            }
        }
        return true;
    }

    public static void prime_in_range(int num){
        for (int i = 2; i <= num; i++) {
            optimize_approach(i);
            if(optimize_approach(i)){ //true
                System.out.print(i+" ");
            }

        }

        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        prime_in_range(n);
    }
}
