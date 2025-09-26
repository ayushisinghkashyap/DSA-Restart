import java.util.*;
class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int s = 0;
        arr.add(n);
        while(s != 1){
            s = sum(n);
            if(arr.contains(s)){
                break;
            }
            else{
                arr.add(s);
                n = s;
            }
        }

        return s == 1;
    }

    public static int sum(int n){
        int s =0;
        while(n > 0){
            int rem = n%10;
            s += rem * rem;
            n = n/10;
        }
        return s;
    }
}