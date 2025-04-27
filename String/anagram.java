import java.util.Arrays;
import java.util.Scanner;

public class anagram {

    public static boolean anagramStrings(String s, String t){
        char[] scharArray = s.toCharArray();
        Arrays.sort(scharArray);
        char[] tcharArray = t.toCharArray();
        Arrays.sort(tcharArray);

        if(s.length() != t.length()){
            return false;
        }

        else{
            boolean count = true;
            for(int i = 0;i<scharArray.length;i++){
                if(scharArray[i] != tcharArray[i]){
                    count = false;
                    break;
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        // String s = "anagram", t = "nagaram";    
        // String s = "aa" , t = "a"   ;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Strings: ");
        String s = sc.nextLine();
        String t = sc.nextLine();
        System.out.println(anagramStrings(s, t));
    }

}
