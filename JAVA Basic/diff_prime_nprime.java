import java.util.Scanner;

public class diff_prime_nprime {
    public static boolean primecheck(int num){
            for (int i = 2; i <= Math.sqrt(num) ; i++) {

                if(num%i == 0){
                    return false;
                }
            }
            return true;
        
    }
     public static void primesum(int arr[],int n){
        int primesum = 0;
        int nonPrimeSum = 0;
        for(int i = 0;i<n;i++){
            boolean ans = primecheck(arr[i]);
            if(ans == true){
                primesum += arr[i];
            }
            else {
                nonPrimeSum += arr[i];
            }
        }

        int diff = (int) Math.abs(primesum - nonPrimeSum);
        System.out.println(diff);
     }

     public static void main(String[] args) {
        // int n = 5;
        // int arr[] = {34,2,5,45,3};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of arr : ");
        int n = sc.nextInt();
        System.out.println("Enter elements : ");
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        primesum(arr,n);
     }

}
