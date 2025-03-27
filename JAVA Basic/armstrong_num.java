import java.util.Scanner;

public class armstrong_num {
    public static int countDigit(int num){ 
        int digit = 0;
        while(num > 0){
            num = num / 10; 
            digit++;
        }
        return digit;
    }
    public static boolean IsArmstrong(int num){
        int temp = num;

        /*  instead of using func , you can use 
         int d = String.valueOf(num).length();
        */
        int d = countDigit(num);
        int sum = 0; 
        while(num > 0){
            int rem = num % 10;
            sum = (int) (sum + Math.pow(rem, d));
            num = num / 10;
        }
        if(temp == sum){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println(num+" is an armstrong number : "+IsArmstrong(num));
    }
}
