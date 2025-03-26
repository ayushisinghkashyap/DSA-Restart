import java.util.Scanner;

public class nNumber {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the range: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(n>0){
            System.out.println(i);
            sum+=i;
            i++;
            n--;
        }
        System.out.println("Sum of n ntural Number: "+sum);
    }
}
