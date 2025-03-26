import java.util.Scanner;

public class checkPrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                count = 1;
            }
            else{
                count = 0;
            }
        }

        if(count==1){
            System.out.println(" Not Prime Number");
        }
        else{
            System.out.println("Prime Number");
        }
    }
}
