package Binary_Search;

import java.util.Scanner;

public class nthRoot {
    public static int root(int n,int m){
        int r = -1;
        if(n == 1){
            return m;
        }
        else{
            int start = 1;
            int end = m;
            while(start <= end){
                int mid = (start +end) /2;
                if(func(n,m,mid) == 1){
                    r = mid;
                    break;
                }
                else if(func(n, m, mid) == 0){
                    end = mid-1;
                }
                else if(func(n,m,mid) >= 2){
                    start = mid+1;
                }
            }
        }
        return r;
    }
    public static int func(int n,int m ,int mid){
        while(n>0){
            m = m/mid;
            n--;
        }
        return m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Enter num: ");
        int num = sc.nextInt();

        // int n = 3;
        // int num = 25;

        System.out.println(root(n, num));
    }
}
