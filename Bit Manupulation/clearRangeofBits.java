import java.util.Scanner;

public class clearRangeofBits {
    
    public static int clearinRange(int n,int j,int i){
        int bitM1 = (~0) << j+1;
        int bitM2 = (1<<i) - 1;  // (1<<i) - 1 = 2^i -1  
        int bitMask = bitM1 | bitM2;
        int num = bitMask & n;
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int j = sc.nextInt();
        int i = sc.nextInt();
        System.out.println(clearinRange(n, j, i));
    }
}
