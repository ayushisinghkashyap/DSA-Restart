import java.math.BigInteger;
public class combinationFactorial {
    public static BigInteger nCr(int n, int r) {
        // code here
        BigInteger nf = factorial(n);
        BigInteger rf = factorial(r);
        int nrf = factorial2(n-r);
        
        BigInteger nr =  rf.multiply(BigInteger.valueOf(nrf));
        BigInteger ncrf = nf.divide(nr);
        
        return ncrf;
    }
    
    public static BigInteger factorial(int n){
        BigInteger f = BigInteger.ONE;
        for(int i=1;i<=n;i++){
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
        return f;
    }

    public static int factorial2(int n){
        int f = 1;
        for(int i=1;i<=n;i++){
            f = f*i;
        }
        System.out.println(f);
        return f;
    }

    public static void main(String[] args) {
        int n = 21;
        int r =16;
        System.out.println(nCr(n, r));
    }
}
