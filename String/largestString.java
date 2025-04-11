import java.util.Scanner;

public class largestString {
    
    public static String largestString(String arr[]){
        String largest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if(largest.compareTo(arr[i]) < 0){     // for compareTo() -> 'A' != 'a'  ,   'a' = 97 , 'A' = 65
                largest = arr[i];                  // you can compareToIgnoreCase ,  -> 'A' = 'a'
            }
        }
        return largest;
    }

    public static void main(String[] args) {

        // String arr[] = {"apple","mango","banana"};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of strings in an array: ");
        int n = sc.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        System.out.println(largestString(arr));
    }
}
