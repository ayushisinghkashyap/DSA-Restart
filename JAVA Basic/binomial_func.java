import java.util.Scanner;

public class binomial_func {

    public static int factorial(int num){
        int f = 1;
        for (int i = 1; i <= num; i++) {
             f*=i;
        }
        return f;
    }
    public static int BinomialCofficient(int n , int r){

        int n_fact = factorial(n); // user defined function
        int r_fact = factorial(r);
        int n_r_fact = factorial(n-r);   

        int Bino_C  = n_fact/(r_fact * n_r_fact);
        return Bino_C;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n : ");
        int n = sc.nextInt(); // predefind function
        System.out.print("r : ");
        int r = sc.nextInt();
        if(n<r){
            System.out.println("Invalid!!! , r cannot be greater than n.");
        }
        else{
            System.out.println("C : "+BinomialCofficient(n, r));
        }
        
    }
}
