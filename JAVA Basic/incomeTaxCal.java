import java.util.Scanner;

public class incomeTaxCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Your Income: ");
        long income = sc.nextLong();
        int tax;

        if(income <= 500000){
            tax =  0;
            System.out.println("your tax is "+tax+"%");
        }
        else if (income > 500000 && income < 1000000){
            tax = 9;
            System.out.println("your tax is "+tax+"%");
        }
        else {
            tax = 30;
            System.out.println("your tax is "+tax+"%");
        }
    }
}
