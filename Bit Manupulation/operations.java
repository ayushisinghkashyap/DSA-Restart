import java.util.Scanner;

public class operations {

    public static int getIthbit(int n,int i){
        int bitmask = 1;
        bitmask = bitmask << i;
        int num = n & bitmask;
        if(num >0){
            //System.out.println(num);
            return 1;
        }
        return 0;
    }

    public static int setIthbit(int n,int i){
        int bitmask = 1;
        bitmask = bitmask << i;
        int num = n | bitmask;
        return num;
    }

    public static int clearIthbit(int n,int i){
        int bitmask = 1;
        bitmask = bitmask << i;
        bitmask = ~bitmask;
        int num = n & bitmask;

        return num;
    }

    public static int updateIthbit(int n, int i, int newbit){
        int num = clearIthbit(n, i);
        newbit = newbit << i-1; 
        num = num | newbit;

        return num;
    }
    
    public static void main(String[] args) {
        // int n = 4;
        // int i = 2;

        Scanner sc = new Scanner(System.in);

        System.out.println("get and set ith bit");
        int n = sc.nextInt();
        int i = sc.nextInt();
        System.out.println("bit at ith position: "+getIthbit(n, i));
        System.out.println("set 1 at ith position: "+setIthbit(n, i));

        // int n1 = 5;
        // int i1 = 1;
        System.out.println("Clear ith bit");
        int n1 = sc.nextInt();
        int i1 = sc.nextInt();
        System.out.println("clear bit at ith position: "+clearIthbit(n1, i1));

        System.out.println("Updation");
        int n2 = sc.nextInt();
        int i2 = sc.nextInt();
        int newbit = sc.nextInt();
        System.out.println("update bit at ith position: "+updateIthbit(n2,i2 , newbit));
    }
}
