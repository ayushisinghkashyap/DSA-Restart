import java.util.Scanner;

public class pelindrome {
    public static String IsPelindrome(int num){
        int temp = num;

        double rev = 0;
        int j = 0;
        while(num > 0){
            int rem = num % 10;
            rev = rev + (rem * Math.pow(10, j));
            num = num / 10;
            j++;
        }
        if(temp == rev){
            return "Pelindrome";
        }
        else{
            return "Not Pelindrome";
        }
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = sc.nextInt();
        System.out.println(IsPelindrome(num));
    }
}
