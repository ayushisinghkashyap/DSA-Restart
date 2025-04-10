public class stock {
    public static int buySellStock(int arr[],int n){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < n; i++) {
            if(buyprice < arr[i]){
                int profit = arr[i] - buyprice;
                maxprofit = Math.max(maxprofit,profit);
            }
            else{
                buyprice = arr[i];
            }
        }
        return maxprofit;
    }


    public static void main(String[] args) {
        int arr[] = {7,1,5,3,6,4};
        int n = 6;
        System.out.println(buySellStock(arr, n));
    }
}
