class Solution {
    public int reverse(int x) {
        boolean n = false;
        if(x<0){
            x = Math.abs(x);
            n = true;
        }

        long num =0;
        while(x>0){
            int rem = x%10;
            num = num*10 + rem;
            x /= 10;
        }

        if(num > Integer.MAX_VALUE) return 0;
        else{
            if(n == true){
                num = -1 * num;
            }
            return (int) num;
        }

        
    }
}