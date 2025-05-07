import java.util.*;
public class repeatNmissing {

    public static void find(int[] arr,int n){
        Arrays.sort(arr);
        int sum = n*(n+1)/2;
        int repeat = 0;
        for(int i =1;i<n;i++){
            if(arr[i] != arr[i-1]){
                sum -= arr[i-1];
            }
            if(arr[i] != arr[i-1] && i==n-1){
                sum -= arr[i];
            }
            else{
                repeat = arr[i-1];
            }
            
        }
        System.out.println("{" + repeat + "," + sum + ")");
    } 
    
    public static void main(String[] args) {
        //int arr[] = {3,1,2,5,3};
        // int arr[] = {3,1,2,5,4,6,7,5};

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        find(arr,n);

    }
}
