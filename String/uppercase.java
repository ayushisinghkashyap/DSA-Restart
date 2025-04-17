import java.util.Scanner;

public class uppercase {
    public static void eachWordToUppercase(String str){
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        while(i < str.length()){
            if(i==0){
                char ch = str.charAt(i);
                sb.append(Character.toUpperCase(ch));
                i++;
            }

            else if(str.charAt(i)==' '){
                sb.append(Character.toUpperCase(str.charAt(i)));
                char ch1 = str.charAt(i+1);
                sb.append(Character.toUpperCase(ch1));
                i=i+2;
            }
            else{
                sb.append(str.charAt(i));
                i++;
            }
        }

        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        // String str = "hello world";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String str = sc.nextLine();
        eachWordToUppercase(str);
    }
}
