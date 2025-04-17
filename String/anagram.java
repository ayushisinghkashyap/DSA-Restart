public class anagram {
    public static boolean checkAnagram(String s, String t){

        boolean count = false;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                if(s.charAt(i) == t.charAt(j)){
                    count = true;
                    break;
                }
                else{
                    count = false;
                }
            }
            if(count == false){
                break;
            }
        }

        boolean count1 = false;
        for (int i = 0; i < t.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if(t.charAt(i) == s.charAt(j)){
                    count1 = true;
                    break;
                }
                else{
                    count1 = false;
                }
            }
            if(count1 == false){
                break;
            }
        }

        count = count && count1;
        return count;
    }

    public static void main(String[] args) {
        String s = "anagram", t = "nagaram";   // s="aa" , t = "a"   gives wrong result 
        System.out.println(checkAnagram(s, t));
    }

}
