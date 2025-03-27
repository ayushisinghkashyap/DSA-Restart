import java.util.Scanner;

public class deciToBinary {
    
    public static long DecimalToBinary(int d){
        double bin = 0;
        int j =0;
        while(d > 0){
            int rem = d % 2;
            bin = bin + (rem*Math.pow(10, j));//1 , 
            d = d / 2;
            j++;
        }
        return (long) bin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Decimal Number: ");
        int d = sc.nextInt();
        
        System.out.println("Binary Form : "+DecimalToBinary(d));
    }
}
