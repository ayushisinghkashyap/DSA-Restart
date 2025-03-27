import java.util.Scanner;

public class binToDecimal {
    public static double BinaryToDecimal(int b){
        double deci = 0;
        int j = 0;
        while(b >0){
            int rem = b % 10;
            deci = deci + (rem * Math.pow(2, j));
            b = b/10;
            j++;
        }

        return deci;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Binary Number : ");
        int binary = sc.nextInt();

        System.out.println("Decimal Form: "+ BinaryToDecimal(binary));
    }
}
