package Binary_Search;

import java.util.Scanner;

public class nthRoot {
    public static int root(int N,int num){
        int r = 1;
        if(N == 1){
            return num;
        }
        else{
            while(r < num){
                int n = N;
                int M = num;
                while(n>0){
                    M = M/r;
                    n--;
                    if(M < 1){
                        r = -1;
                        break;
                    }
                }
                if(M == 1){
                    break;
                }
                else if(r == -1){
                    break;
                }
    
                r++;
            }

            return r;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.print("Enter num: ");
        int num = sc.nextInt();
        System.out.println(root(n, num));
    }
}
