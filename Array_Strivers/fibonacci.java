public class fibonacci {
    public static void main(String[] args) {
        int f1 =0;
        int f2 = 1;
        int n =8;
        int f3 = f2;
        
        for (int i = 0; i <n; i++) {
            System.out.println(f1);
            System.out.println(f2);
            f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;
            
        }
    }
}
