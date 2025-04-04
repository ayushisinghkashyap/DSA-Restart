import java.util.Scanner;

public class lar_med_small {
    public static void comparison(int a, int b,int c){
        int med = 0;
        int large = 0;
        int small = 0;

        if(a>b && a>c){
            large = a;
            if(b>c){
                med = b;
                small = c;
            }
            else{
                med = c;
                small = b;
            }
        }
        else if(b>a && b>c){
            large = b;
            if(a>c){
                med = a;
                small = c;
            }
            else{
                med = c;
                small = a;
            }
        }
        else{
            large = c;
            if(a>b){
                med = a;
                small = b;
            }
            else{
                med = b;
                small = a;
            }
        }

        System.out.println("large: "+large);
        System.out.println("Med: "+med);
        System.out.println("Small: "+small);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        comparison(a, b, c);
    }
}
