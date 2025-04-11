import java.util.Scanner;

public class pelindrome {
    
    public static void checkPelindrome(String str){
        int n = str.length();
        int count = 1;
        for (int i = 0; i <= n/2; i++) {
            if(str.charAt(i) != str.charAt(n-i-1)){
                count--;
                break;
            }
        }

        if(count == 1){
            System.out.println("Pelindrome");
        }
        else{
            System.out.println("Not Pelindrome");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String str = sc.nextLine();
        checkPelindrome(str);
    }
}