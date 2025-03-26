import java.util.Scanner;

public class feverchack {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Your Temperature(Faherenheit) : ");
        double temp = sc.nextDouble();
        if(temp>100){
            System.out.println("You have fever!!!");
        }
        else{
            System.out.println("You are fine...");
        }
    }
}
