
import java.io.*;
import java.util.*;

public class Akshay {
    static final int MOD = 998244353;
    static final int max = 2001;
    static long[] fact = new long[max];
    static long[] infact = new long[max];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // Read N - 1 lines (assuming they are unused edges or inputs)
        for (int i = 0; i < N - 1; i++) {
            br.readLine();
        }

        precomputeFact(N);

        for (int x = 1; x <= N; x++) {
            long choose = nCr(N - 1, x - 1);
            long power = power(2, N - x);
            long result = (choose * power) % MOD;
            System.out.println(result);
        }
    }

    public static void precomputeFact(int n) {
        fact[0] = infact[0] = 1;
        for (int i = 1; i <= n; i++) {
            fact[i] = (fact[i - 1] * i) % MOD;
        }
        for (int i = 1; i <= n; i++) {
            infact[i] = power(fact[i], MOD - 2);
        }
    }

    public static long nCr(int n, int r) {
        if (r < 0 || r > n) return 0;
        return (((fact[n] * infact[r]) % MOD) * infact[n - r]) % MOD;
    }

    public static long power(long base, long exp) {
        long result = 1;
        base %= MOD;

        while (exp > 0) {
            if ((exp & 1) == 1)
                result = (result * base) % MOD;
            base = (base * base) % MOD;
            exp >>= 1;
        }

        return result;
    }
}

