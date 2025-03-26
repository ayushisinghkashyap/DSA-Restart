import java.util.Scanner;

public class Num_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.println("Table of "+num);

        // basic approach
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println(num*i);
        // }

        for (int i = 1; i <= 10; i++) {
            System.out.println(num+" * "+i+" = "+num*i);
        }

        // table of each number till num
        // for (int i = 2; i <= num; i++) {
        //     System.out.println("Table of "+i);
        //     for (int j = 1; j <= 10; j++) {
        //         System.out.println(i+" * "+j+" = "+i*j);
        //     }
        //     System.out.println();
        // }
    }
}
