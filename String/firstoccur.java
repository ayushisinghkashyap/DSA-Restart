public class firstoccur {

    public static int strStr(String haystack, String needle) {
        int count = 0;
        int j=0;
        for(int i=0;i<haystack.length();i++){
            if(j<needle.length() && haystack.charAt(i) == needle.charAt(j)){
                j++;
                if(j == needle.length() && haystack.charAt(i) == needle.charAt(j-1)){
                    System.out.println(i);
                    count = i - needle.length() + 1;
                    break;
                }
                
            }
            else if(haystack.charAt(i) == needle.charAt(0)){
                    j=0;
                    i--;
                }
            else{
                j=0;
            }
        }

        if(j==0){
            return -1;
        }
        else{
            return count;
        }
    }

    public static void main(String[] args) {
        // String h = "hello";
        // String c = "ll";
        // String h = "sadbutsad";
        // String c = "sad";
        String h = "mississippi";
        String c = "issip";
        System.out.println(strStr(h, c));
    }
}