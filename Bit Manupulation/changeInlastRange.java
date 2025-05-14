public class changeInlastRange {
    public static int clearinRange(int n ,int i){
        int bitmask = -1;
        bitmask = bitmask << i;
        int num = n & bitmask;

        return num;
    }
    public static int updateIthbit(int n, int i, int newbit){
        if(newbit == 0){
            int num = clearinRange(n, i);
            return num;
        }
        else{
            int bitmask = -1;
            bitmask = bitmask << i;
            bitmask = ~bitmask;
            int num = n | bitmask;
            return num;
        }
    }

    public static void main(String[] args) {
        int n = 9;
        int i = 2;
        System.out.println(clearinRange(n, i));

        System.out.println(updateIthbit(n, 3, 1));
    }
}
