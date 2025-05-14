import java.math.BigInteger;

public class combinationfact2 {
    public static long nCr(int n, int r) {
        if(r>n){
            return 0;
        }
        else{
            long f= 1;
            int nr = n-r;
            int nrc = 1;
            for(int i=r+1;i<=n;i++){
                f = f*i;
                if(nrc <= nr && nrc !=0){
                    if(f%nrc == 0){
                        f = f/nrc;
                        nrc++;
                    }
                    else{
                        nr = 0;
                    }
                }
            }

            return f;
        }
    }
    
    // public static int factorial1(int n,int r){
    //     int f= 1;
    //     int nr = n-r;
    //     int nrc = 1;
    //     for(int i=r+1;i<=n;i++){
    //         f = f*i;
    //         if(nrc <= nr && nrc !=0){
    //             if(f%nrc == 0){
    //                 f = f/nrc;
    //                 nrc++;
    //             }
    //             else{
    //                 nr = 0;
    //             }
    //         }
    //     }

    //     return f;
    // }

    // public static int factorial2(int n){
    //     int f = 1;
    //     for(int i=1;i<=n;i++){
    //         f = f*i;
    //     }
        
    //     return f;
    // }

    public static void main(String[] args) {
        // int n = 21;
        // int r = 16;
        // int n = 4;
        // int r = 4;
        // int n = 25;
        // int r = 10;
        int n = 32;
        int r = 12;
        
        System.out.println(nCr(n, r));
    }
}
