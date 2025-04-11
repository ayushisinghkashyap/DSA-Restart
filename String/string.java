import java.util.Scanner;

public class string {

    public static void lengthfunction(String str5){
        int n = str5.length();  // the length() counts space too
        System.out.println("length of string: "+n);

        for (int i = 0; i < n; i++) {
            System.out.print(str5.charAt(i)+" ");  // print all the characters in the string
        }
    }

    public static void main(String[] args) {
        
        String str = "abcd";                       // both are same at implementation level 
        String str2 = new String("xyz"); //but have different meaning when it comes to memory allocation  
        System.out.println(str+"\n"+str2);

        //input 
        Scanner sc = new Scanner(System.in);
        String str3 = sc.next();
        System.out.println(str3); // it will print only first word and takes it as an input , not consider the second word

        // String str4 = sc.nextLine();   // it will print all words in a line and takes them as an input
        // System.out.println(str4);

        String str5 = "Programming";
        lengthfunction(str5);

        // concatenation
        String firstName = "Tony";
        String lastName = " Stark";
        System.out.println(firstName+" "+lastName);    // 
    }
}