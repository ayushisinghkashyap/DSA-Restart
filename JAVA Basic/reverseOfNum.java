import java.util.Scanner;

public class reverseOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();  // 1234
        while(num>0){
            int rem = num % 10; // reminder : 4, 3, 2, 1
            System.out.print(rem);
            num = num/10; // quotient: 123 , 12, 1 
        }
    }
}
