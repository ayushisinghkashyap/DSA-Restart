public class SubString {
    
    public static String printsubstring(String str, int si,int ei){
        String substr = ""; 
        for (int i = si; i < ei; i++) {
            substr += str.charAt(i);
        }

        return substr;
    }

    public static void main(String[] args) {
        String str = "Hello World";
        int si = 0, ei = 4;
        
        // basic approach
        System.out.println(printsubstring(str, si, ei));

        // function to print sub string
        System.out.println(str.substring(3,8));
    }
}
